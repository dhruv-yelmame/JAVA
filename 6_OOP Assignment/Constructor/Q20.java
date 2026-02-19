/*Q20. Create a Franchise class with constructor:
franchiseId, ownerName, monthlySales, city, targetSales

Menu options:
1. Register franchise
2. Calculate monthly incentive:
	If sales ≥ target → 10% incentive
	If sales ≥ 2 × target → 25% incentive
	If sales < target → NO incentive
3. Display underperforming franchises (sales < 0.7 × target)
4. Find franchise with highest incentive
5. Display franchises city-wise (filter by a given city)
*/

import java.util.*;
class Franchise
{
	private int franchiseId;
	private String ownerName;
	private int monthlySales;
	private String city;
	private int targetSales;
	Franchise(int franchiseId,String ownerName,int monthlySales,String city,int targetSales)
	{
		this.franchiseId=franchiseId;
		this.ownerName=ownerName;
		this.monthlySales=monthlySales;
		this.city=city;
		this.targetSales=targetSales;
	}
	
	int getMS()
	{
		return monthlySales;
	}
	
	String getCity()
	{
		return city;
	}
	int getTS()
	{
		return targetSales;
	}
	
	double calculateIncentives()
	{
		double incentive = 0;
		if(getMS() >= getTS())
			return getMS()*0.10;
		else if(getMS() >= 2*getTS())
			return getMS()*0.25;
		else
			return incentive;
	}
	
	void display()
	{
		System.out.println("FranchiseID: "+franchiseId+"\t"+"Owner: "+ownerName+"\t"+"MonthlySales: "+monthlySales+"\t"+"City: "+city+"\t"+"TargetSales: "+targetSales+"\t"+"Incentive: "+calculateIncentives());
	}
	
}
public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Franchise f[] = new Franchise[5];
		int count=0;
		char ch;
		
		do
		{
			System.out.println("1. Register franchise");
			System.out.println("2. Calculate monthly incentive");
			System.out.println("3. Display underperforming franchises (sales < 0.7 × target)");
			System.out.println("4. Find franchise with highest incentive");
			System.out.println("5. Display franchises city-wise (filter by a given city)");
			System.out.println("6. Exit");
			
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("enter franchiseId: ");
					int franchiseId = sc.nextInt();
					System.out.print("enter ownerName: ");
					String ownerName = sc.next();
					System.out.print("enter monthlySales: ");
					int monthlySales = sc.nextInt();
					System.out.print("enter city: ");
					String city = sc.next();
					System.out.print("enter targetSales: ");
					int targetSales = sc.nextInt();
					
				f[count++] = new Franchise(franchiseId,ownerName,monthlySales,city,targetSales);
				break;
				
				case 2:
					for(int i=0; i<count; i++)
					{
						f[i].calculateIncentives();
						f[i].display();
					}
				break;
				
				case 3:
					for(int i=0; i<count; i++)
					{
						if(f[i].getMS() < 0.7 * f[i].getTS())
						{
							f[i].display();
						}
					}
				break;
				
				case 4:
					int index=0;
					for(int i=0; i<count; i++)
					{
						if(f[i].calculateIncentives() > f[index].calculateIncentives())
						{
							index=i;
						}
					}
					
					f[index].display();
				break;
				
				case 5:
					System.out.print("enter the city: ");
					city = sc.next();
					for(int i=0; i<count; i++)
					{
						if(f[i].getCity().equalsIgnoreCase(city))
						f[i].display();
					}
				break;
				
				case 6:
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice!");
			}
			
			System.out.print("Do you want to continue(y/n): ");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
	}
}