/*Q5. Create 2 threads and print their names using getName().
Output:
Thread-0
Thread-1
*/

class One extends Thread
{
	public void run()
	{
		try
		{
			System.out.println(getName());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}

class Two extends Thread
{
	public void run()
	{
		try
		{
			System.out.println(getName());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}

public class Q5
{
	public static void main(String x[]) throws InterruptedException
	{
		One o = new One();
		o.start();
		
		Two t = new Two();
		t.start();
	}
}