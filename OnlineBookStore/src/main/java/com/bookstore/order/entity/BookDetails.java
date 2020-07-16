package com.bookstore.order.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "Book_details")
public class BookDetails
{

@Id
@Column(name = "Book_Id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer BookId;


@Column(name = "Title")
private String Title;


@Column(name = "Author")
private String Author;


@Column(name = "Description")
private String Description;


@Column(name = "ISBN")
private String ISBN;

@Column(name = "Image")
private String img;

@Column(name = "Price")
private float Price;

@Column(name = "Publish_Date")
@DateTimeFormat(pattern="dd.MM.yyyy")
private Date date;



public Integer getBookId() {
	return BookId;
}

public void setBookId(Integer bookId) {
	BookId = bookId;
}

public String getTitle() {
	return Title;
}

public void setTitle(String title) {
	Title = title;
}

public String getAuthor() {
	return Author;
}

public void setAuthor(String author) {
	Author = author;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

public String getISBN() {
	return ISBN;
}

public void setISBN(String iSBN) {
	ISBN = iSBN;
}

public String getImg() {
	return img;
}

public void setImg(String img) {
	this.img = img;
}

public float getPrice() {
	return Price;
}

public void setPrice(float price) {
	Price = price;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}
public BookDetails() {

}

public BookDetails(Integer bookId, String title, String author, String description, String iSBN, String img, float price,
	Date date) {
super();
BookId = bookId;
Title = title;
Author = author;
Description = description;
ISBN = iSBN;
this.img = img;
Price = price;
this.date = date;
}
}





