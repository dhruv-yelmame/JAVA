/*Q1. Create two threads:
Thread 1 prints numbers from 1–5
Thread 2 prints numbers from 6–10
Both threads should run simultaneously.
Output: 1 6 2 7 3 8 4 9 5 10
*/

class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.print(i+" ");
				Thread.sleep(10);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
class Second extends Thread
{
	public void run()
	{
		try
		{
			for(int i=6; i<=10; i++)
			{
				System.out.print(i+" ");
				Thread.sleep(10);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
public class Q1
{
	public static void main(String x[]) throws InterruptedException
	{
		First f = new First();
		f.start();
		
		Second s = new Second();
		s.start();
	}
}