package com.training.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class BookEntity 
{
	@Id
	@GeneratedValue
	long id;
	@NotNull
	String name;
	@NotNull
	String author;
	@NotNull
	Date publishDate;

	public BookEntity(long id, String name, String author, Date publishDate) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishDate = publishDate;

	}
	public BookEntity() {
		// TODO Auto-generated constructor stub
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
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	

}
