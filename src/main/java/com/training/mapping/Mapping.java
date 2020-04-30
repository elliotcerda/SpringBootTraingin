package com.training.mapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.training.dto.Book;
import com.training.jpa.BookEntity;

@Component
public class Mapping {
	
	public Book mapBook(BookEntity bookEntity) {
			Book book = new Book();
			book.setId(bookEntity.getId());
			book.setName(bookEntity.getName());
			book.setAuthor(bookEntity.getAuthor());
			book.setPublishDate(bookEntity.getPublishDate());

			return book;
	}	
	
	public List<Book> mapBook(List<BookEntity> bookEntity) {
		List<Book> bookList = new ArrayList<Book>();
		for(BookEntity bookE : bookEntity)
		{
			Book book = new Book();
			book.setId(bookE.getId());
			book.setName(bookE.getName());
			book.setAuthor(bookE.getAuthor());
			book.setPublishDate(bookE.getPublishDate());

			
			bookList.add(book);			
		}
			
		return bookList;
	}

}
