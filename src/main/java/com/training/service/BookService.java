package com.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.dto.Book;
import com.training.jpa.BookEntity;
import com.training.repository.BookRepository;
import com.tranining.exception.BookNotFoundException;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<BookEntity> getAllBooks(){
		List<BookEntity> list = new ArrayList<BookEntity>();
		bookRepository.findAll().forEach(list::add);
		return list;
	}
	
	public BookEntity createBook(Book book){
		BookEntity newBook= new BookEntity();
		newBook.setId(book.getId());
		newBook.setName(book.getName());
		newBook.setAuthor(book.getAuthor());		
		newBook.setPublishDate(book.getPublishDate());

		return bookRepository.save(newBook);
	}

	public BookEntity getBook(String searchInt) {
		Long id = Long.parseLong(searchInt);
		Optional<BookEntity> book = bookRepository.findById(id);
		
		if(book.isPresent()) {
			return book.get();
		}
		else {
			throw new BookNotFoundException("Book with id "+searchInt+" was not found");
		}
	}

	public List<BookEntity> searchBookByName(String name) {
		List<BookEntity> returnList = bookRepository.searchByName(name);
		if(returnList.isEmpty()) {
			throw new BookNotFoundException("No coindidences found for "+name+" search.");
		}
		return returnList; 
	}

	@Transactional
	public void deleteBook(String searchInt) {
		BookEntity bookEntity = getBook(searchInt);
//		Long id = Long.parseLong(searchInt);
		System.out.println("Deleting "+bookEntity.getId());
		bookRepository.deleteById(bookEntity.getId());
	}
}

