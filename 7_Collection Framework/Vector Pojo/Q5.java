package com.vectorPojo;
import java.util.*;
class Book
{
	public Book(int bookId, String title, String author, int price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	private int bookId;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	private String title;
	private String author;
	private int price;
	
	
}

public class Q5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Vector v = new Vector();
	
	v.add(new Book(1,"Engineer","Dhruv",100));
	v.add(new Book(2,"BGMI","Ram",49));
	v.add(new Book(3,"AAN","Dhiraj",400));
	v.add(new Book(4,"Noob","Venki",900));
	
	int count=0;
	double average=0;
	do
	{
		System.out.println("1.Count total books");
		System.out.println("2.Search books by author");
		System.out.println("3.Display books costing more than average price");
		
		System.out.print("enter choice: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Count: "+v.size());
			break;
		case 2:
			System.out.print("enter author name: ");
			String name = sc.next();
			boolean flag = false;
			for(Object obj : v)
			{
				Book b = (Book)obj;
				if(b.getAuthor().equals(name))
				{
					System.out.println(b.getBookId()+"\t"+b.getTitle()+"\t"+b.getAuthor());
					flag = true;
					break;
				}
			}
			if(!flag)
				System.out.println("name does not found");
			break;
		case 3:
			int totalPrice = 0;
			for(Object obj : v)
			{
				Book b = (Book)obj;
				totalPrice += b.getPrice();
			}
			average = (double) totalPrice / v.size();
			
			for(Object obj : v)
			{
				Book b = (Book)obj;
				if(b.getPrice() > average)
				{
					System.out.println(b.getBookId()+"\t"+b.getTitle()+"\t"+b.getAuthor()+"\t"+b.getPrice());
				}
			}
			break;
		default:
				System.out.println("Invalid Choice");
		}
	}while(true);
	}

}
