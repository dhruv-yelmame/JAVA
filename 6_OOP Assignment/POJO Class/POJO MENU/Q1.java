/*Q1. Create a class called Library to hold accession number,title of the book,author name,price of the book and write a menu driven program in java that implements the working of a library :
		The menu options should be: 
		1. Add Book Details.
		2. Display All Book Details.
		3. Display List of all book of given author.
		4. Display list the title of specified book.
		5. Display list count of the book in the library.
		6. Display list the books in the ascending order of accession number.
		7. Update book details by title of book.
		8. Delete book details by price.
		9. Display the price range between 100 to 500.
		10. Exit The Code.
*/

import java.util.*;
class Library
{
	private int accNo;
	private String title;
	private String author;
	private int price;

	public void setAccNo(int accNo)
	{
		this.accNo=accNo;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	
	int getAccNum()
	{
		return accNo;
	}
	String getTitle()
	{
		return title;
	}
	String getAuthor()
	{
		return author;
	}
	int getPrice()
	{
		return price;
	}
}

class DisplayLibrary
{
	Scanner sc = new Scanner(System.in);
	private Library l[];
	public void menu(Library l[])
	{
		this.l=l;
	}
	
	void bookDetail(Library l[])
	{
		
		for(int i=0; i<l.length; i++)
		{
			l[i] = new Library();
			System.out.print("enter the accession number: ");
			int accNo = sc.nextInt();
			System.out.print("enter the title of book: ");
			String title = sc.next();
			System.out.print("enter the author name: ");
			String author = sc.next();
			System.out.print("enter the price: ");
			int price = sc.nextInt();
			System.out.print("\n");
			
			l[i].setAccNo(accNo);
			l[i].setTitle(title);
			l[i].setAuthor(author);
			l[i].setPrice(price);
		}
	}
	
	void disBookDetail(Library l[])
	{
		System.out.println("AccNumber--Title--Author--Price");
		for(int i=0; i<l.length; i++)
		{
			System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
		}
	}
	
	void disBookByAuthor(Library l[])
	{
		System.out.print("enter the author name: ");
		String author = sc.next();
		
		System.out.println("AccNumber--Title--Author--Price");
		for(int i=0; i<l.length; i++)
		{
			if(author.equals(l[i].getAuthor()))
			{
				System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
			}
		}
	}
	
	void disTitleByBook(Library l[])
	{
		System.out.print("enter the book name: ");
		String title = sc.next();
		
		System.out.println("AccNumber--Title--Author--Price");
		for(int i=0; i<l.length; i++)
		{
			if(title.equals(l[i].getTitle()))
			{
				System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
			}
		}
	}
	
	void disCountBook(Library l[])
	{
		System.out.println("Count of Book: "+l.length);
	}
	
	void disBookByAsc(Library l[])
	{
		System.out.println("AccNumber--Title--Author--Price");
		for(int i=0; i<l.length; i++)
		{
			for(int j=i+1; j<l.length; j++)
			{
				if(l[i].getAccNum() > l[j].getAccNum())
				{
					Library temp = l[i];
					l[i] = l[j];
					l[j] = temp;
				}
			}
			
		}
		
		for(int i=0; i<l.length; i++)
		{
			System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
		}
	}
	
	void updateBookByTitle(Library l[])
	{
		System.out.print("enter the book title: ");
		String title = sc.next();
		
		for(int i=0; i<l.length; i++)
		{
			if(title.equals(l[i].getTitle()))
			{
				System.out.println("Edit book details");

				System.out.print("enter the accession number: ");
				int acc = sc.nextInt();

				System.out.print("enter the title: ");
				String t = sc.next();

				System.out.print("enter the author name: ");
				String a = sc.next();

				System.out.print("enter the price: ");
				int p = sc.nextInt();

				l[i].setAccNo(acc);
				l[i].setTitle(t);
				l[i].setAuthor(a);
				l[i].setPrice(p);
				break;
			}
		}
	}
	
	void deleteBookByPrice(Library l[])
	{
		
	}
	
	void disBookByPrice(Library l[])
	{
		System.out.println("book details price range between 100 to 500.");
		
		for(int i=0; i<l.length; i++)
		{
			if((l[i].getPrice() >= 100) && (l[i].getPrice() <= 500))
			{
				System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
			}
		}
	}
	
}

public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayLibrary dl = new DisplayLibrary();
		Library l[] = new Library[4];
		
		int choice;
		char ch;
		
		do 
		{
			System.out.println("\n===== MENU =====");
            System.out.println("1. Add Book Details.");
            System.out.println("2. Display All Book Details.");
            System.out.println("3. Display List of all book of given author.");
			System.out.println("4. Display list the title of specified book.");
            System.out.println("5. Display list count of the book in the library.");
            System.out.println("6. Display list the books in the ascending order of accession number.");
            System.out.println("7. Update book details by title of book.");
            System.out.println("8. Delete book details by price.");
            System.out.println("9. Display the price range between 100 to 500.");
			System.out.println("10. Exit The Code.");


            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					dl.bookDetail(l);
					break;
					
				case 2:
					dl.disBookDetail(l);
					break;
				
				case 3:
					dl.disBookByAuthor(l);
					break;
					
				case 4:
					dl.disTitleByBook(l);
					break;
				
				case 5:
					dl.disCountBook(l);
					break;
					
				case 6:
					dl.disBookByAsc(l);
					break;
					
				case 7:
					dl.updateBookByTitle(l);
					break;
				
				case 8:
					dl.deleteBookByPrice(l);
					break;
					
				case 9:
					dl.disBookByPrice(l);
					break;
					
				case 10:
					System.out.print("Exiting System...");
					System.exit(0);
					
				default:
					System.out.print("Invalid Option !");
					
			}
			
				System.out.print("\nDo you want to continue? (y/n): ");
				ch = sc.next().charAt(0);
				
		}while(ch == 'y' || ch == 'Y');
	}
}