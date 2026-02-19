/*Q29. WAP to create POJO class name as Book with field id,name and authors and price and
arrange  all books in descending order by using price.
*/

class Book
{
	private int id;
	private String name;
	private String author;
	private int price;
	
	public void setBook(int id,String name,String author,int price)
	{
		this.id=id;
		this.name=name;
		this.author=author;
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
	public String getAuthor()
	{
		return author;
	}
	public int getPrice()
	{
		return price;
	}
}

public class Q29
{
	public static void main(String x[])
	{
		Book b[] = new Book[4];
		
		b[0] = new Book();
		b[0].setBook(1,"Destiny","Mayur",399);
		
		b[1] = new Book();
		b[1].setBook(2,"Bgmi","Shriram",99);
		
		b[2] = new Book();
		b[2].setBook(3,"Rich","Harshad",199);
		
		b[3] = new Book();
		b[3].setBook(4,"XXIII","Dhruv",299);
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length; j++)
			{
				if(b[i].getPrice() < b[j].getPrice())
				{
					Book temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
		System.out.println("all books in descending order by using price");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getAuthor()+"\t"+b[i].getPrice());
		}
	}
}