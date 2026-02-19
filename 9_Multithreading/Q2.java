/*Q2. Create two threads:
One thread for even numbers (1–20)
One thread for odd numbers (1–20)
Output:
Odd: 1
Even: 2
Odd: 3
Even: 4
*/


class Odd extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=20; i+=2)
			{
				System.out.println("Odd: "+i);
				sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}
}
class Even extends Thread
{
	public void run()
	{
		try
		{
			for(int i=2; i<=20; i+=2)
			{
				System.out.println("Even: "+i);
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}


public class Q2
{
	public static void main(String x[]) throws InterruptedException
	{
		Odd o = new Odd();
		o.start();
		
		Even e = new Even();
		e.start();
	}
}
