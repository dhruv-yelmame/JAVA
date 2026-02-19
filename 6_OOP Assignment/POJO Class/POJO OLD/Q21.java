/*Q21. WAP to create POJO class name as Book with field id,name and price and we have to
create one more class name as Library and Library class contain two methods
void setBook(Book book)
void showBook()
*/

import java.util.*;
class Book
{
	private int id;
	private String name;
	private int price;
	
	public void setBook(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId() 
	{
        return id;
    }

    public String getName() 
	{
        return name;
    }

    public int getPrice()
	{
        return price;
    }
}

class Library
{
	private Book book;

    public void setBook(Book book)
    {
        this.book = book;
    }
	
	public void showBook()
    {
        System.out.println("ID\tName\tPrice");
        System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getPrice());
    }

}

public class Q21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the id: ");
		int id = sc.nextInt();
		System.out.print("enter the name: ");
		String name = sc.next();
		System.out.print("enter the price: ");
		int price = sc.nextInt();
		
		Book b = new Book();
		b.setBook(id, name, price);
		
		Library lib = new Library();
        lib.setBook(b);
        lib.showBook();
	}
}