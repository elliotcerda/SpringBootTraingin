package com.training.resource;

import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.training.dto.Book;
import com.training.mapping.Mapping;
import com.training.service.BookService;

@RestController
public class BookResource {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private Mapping mapping;
	
	@GetMapping(path="/book")
	public List<Book> getAllBooks(){
		return mapping.mapBook(bookService.getAllBooks());
				
	}
	
	@GetMapping(path="/book/{id}")
	public Book getBook(@PathVariable String id){
		System.out.println("Getting "+id+ " book...");
		Book bookFound = mapping.mapBook(bookService.getBook(id));
//		HATEOAS
		return bookFound;
	}
	
	@GetMapping(path="/book/search/{name}")
	public List<Book> searchBookByName(@PathVariable String name){
		System.out.println("Searching "+name+ "book...");
		return mapping.mapBook(bookService.searchBookByName(name));
	}
	
	@PostMapping(path="/book")
	public ResponseEntity<Object> createBook(@Valid @RequestBody Book newBook){
		Book createdBook = mapping.mapBook(bookService.createBook(newBook));		
		
//		Return the location of new created resource on the response HEADERS
		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(createdBook.getId())
			.toUri();
//		Return 201 CREATED
//		HATEAOS
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping(path="/book/{id}")
	public void deleteById(@PathVariable String id) {
		bookService.deleteBook(id);
	}
	
	@GetMapping(path="/hello-world")
	public String hello() {
		return "Hello world";
	}
	
//	@PostMapping("/book")
//	public void createBook(){
//		
//	}
}
