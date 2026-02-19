/*Q5. Problem  
Write a java to Create class name as Food with using data member fid,fname,fprice, fcategory using do while and switch case.
create array of object of size 5 ,store the food details in it and perform following operations.	
	1 : Add All Food details.
	2 : Display All Food details.
	3 : Display Bill Details :
		1 : Bill Without Gst.
		2 : Bill With 18% Gst.
*/

import java.util.*;
class Food
{
	private int id;
	private String name;
	private int price;
	private String category;
	
	public void StoreDetail(int id,String name,int price,String category)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.category=category;
	}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	int getPrice()
	{
		return price;
	}
	String getCategory()
	{
		return category;
	}
}


class DisplayFood
{
	void displayAll(Food f[])
	{
		System.out.println("\n----- ALL FOOD DETAILS -----");
		System.out.println("ID__NAME__PRICE__CATEGORY");
		for(int i=0; i<f.length; i++)
		{
			System.out.println(f[i].getId()+"\t"+f[i].getName()+"\t"+f[i].getPrice()+"\t"+f[i].getCategory());
		}
	}
	
	void billWithoutGST(Food f[])
	{
		int total=0;
		for(int i=0; i<f.length; i++)
		{
			total+=f[i].getPrice();
		}
		System.out.println("Bill Without GST: "+total);
	}
	
	void billWithGST(Food f[])
	{
		int total=0;
		for(int i=0; i<f.length; i++)
		{
			total+=f[i].getPrice();
		}
		
		double gst = total * 0.18;
        double finalBill = total + gst;

        System.out.println("\nTotal Amount: " + total);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Bill: " + finalBill);
	}
}

public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Food f[] = new Food[5];
		DisplayFood df = new DisplayFood();
		
		int choice;
		char ch;
		
		do
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1 : Add All Food Details");
            System.out.println("2 : Display All Food Details");
            System.out.println("3 : Display Bill Details");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				for(int i=0; i<f.length; i++)
				{
					f[i] = new Food();
					System.out.print("enter the food id: ");
					int id = sc.nextInt();
					System.out.print("enter the food name: ");
					String name = sc.next();
					System.out.print("enter the food price: ");
					int price = sc.nextInt();
					System.out.print("enter the food category: ");
					String category = sc.next();
					System.out.print("\n");
					f[i].StoreDetail(id,name,price,category);
				}
				break;
				
				case 2:
                    df.displayAll(f);
                    break;
				
				case 3: 
					System.out.println("\n1 : Bill Without GST");
                    System.out.println("2 : Bill With 18% GST");
                    System.out.print("Enter choice: ");
                    int b = sc.nextInt();
					
					if(b==1)
						df.billWithoutGST(f);
					else if(b==2)
						df.billWithGST(f);
					else
						System.out.println("Invalid option!");
					
					break;
					
				default:
					System.out.println("Invalid Choice!");
		
			}
				System.out.print("\nDo you want to continue? (y/n): ");
				ch = sc.next().charAt(0);
				
		}while(ch == 'y' || ch == 'Y');
	}
}