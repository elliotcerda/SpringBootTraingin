package com.training.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Book {
	long id;
	@Size(min=2, message="Name should have at least 2 charachters ")
	String name;
	@NotNull
	String author;
	@Past
	Date publishDate;

	
	public Book(long id, @Size(min = 2) String name, String author, @Past Date publishDate) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishDate = publishDate;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publishDate=" + publishDate + "]";
	}

}
