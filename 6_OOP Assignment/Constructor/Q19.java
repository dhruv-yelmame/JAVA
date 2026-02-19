/*Q19. Create a DeliveryOrder class with constructor:
orderId, customerName, distanceInKm, timeSlot (Morning, Afternoon, Night)

Menu options:
1. Add delivery order
2. Calculate delivery charges:
	Base charge = ₹50
	Distance charge = ₹10 per km
	Time slot charges:
		Night → additional ₹40
		Morning / Afternoon → ₹0
3. Show “Priority Orders” (distance > 15 km OR timeSlot = Night)
4. Display order with highest delivery charge
5. Sort orders by distance (high → low)
*/


import java.util.*;
class DeliveryOrder
{
	private int orderId;
	private String customerName;
	private int distanceInKm;
	private String timeSlot;
	DeliveryOrder(int orderId,String customerName,int distanceInKm,String timeSlot)
	{
		this.orderId=orderId;
		this.customerName=customerName;
		this.distanceInKm=distanceInKm;
		this.timeSlot=timeSlot;
	}
	int getOrderId()
	{
		return orderId;
	}
	String getTimeSlot()
	{
		return timeSlot;
	}
	int getDistance()
	{
		return distanceInKm;
	}
	
	void display()
	{
		System.out.println("OrderId: "+orderId+"\t"+"CustomerName: "+customerName+"\t"+"DistanceInKm: "+distanceInKm+"\t"+"TimeSlot: "+timeSlot+"\t"+"Charge: "+calulateCharge());
	}
	
	int calulateCharge()
	{
		int total=0;
		if(getTimeSlot().equalsIgnoreCase("night"))
		return total = 50 + getDistance()*10+40;
		else
		return total = 50 + getDistance()*10;	
	}
	
}
public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DeliveryOrder d[] = new DeliveryOrder[5];
		char ch;
		int count=0;
		
		do
		{
			System.out.println("1. Add delivery order");
			System.out.println("2. Calculate delivery charges");
			System.out.println("3. Show Priority Orders (distance > 15 km OR timeSlot = Night)");
			System.out.println("4. Display order with highest delivery charge");
			System.out.println("5. Sort orders by distance (high → low)");
			System.out.println("6. Exit");
			
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("enter the orderId: ");
					int orderId = sc.nextInt();
					System.out.print("enter the customerName: ");
					String customerName = sc.next();
					System.out.print("enter distanceInKm: ");
					int distanceInKm = sc.nextInt();
					System.out.print("enter the timeSlot: ");
					String timeSlot = sc.next();
					d[count++] = new DeliveryOrder(orderId,customerName,distanceInKm,timeSlot);
					break;
				
				case 2:
					for(int i=0; i<count; i++)
					{
						d[i].calulateCharge();
						d[i].display();
					}
					break;
				
				case 3:
					for(int i=0; i<count; i++)
					{
						if(d[i].getDistance() > 15 || d[i].getTimeSlot().equalsIgnoreCase("night"))
						d[i].display();
					}
					break;
					
				case 4:
					int index = 0;

					for(int i=1; i<count; i++)
					{
						if(d[i].calulateCharge() > d[index].calulateCharge())
						{
							index = i;
						}
					}

					d[index].display();
					break;
					
				case 5:
					for(int i=0; i<count; i++)
					{
						for(int j=i+1; j<count; j++)
						{
							if(d[i].getDistance() < d[j].getDistance())
							{
								DeliveryOrder temp = d[i];
								d[i] = d[j];
								d[j] = temp;
							}
						}
					}
					for(int i=0; i<count; i++)
						d[i].display();
					break;
					
				case 6:
					System.exit(0);
					
				default:
					System.out.print("Invalid Choice!");
			}
			
			System.out.print("Do you want to continue(y/n): ");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		
	}
}