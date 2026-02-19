/*Q7. Create two threads:
Thread A prints 1–5
Thread B should start only after A finishes.
Explanation:
Use t1.join() before starting t2.
*/

class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=6; i<=10; i++)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class Q7
{
	public static void main(String x[]) throws InterruptedException
	{
		A a = new A();
		a.start();
		a.join();
		
		B b = new B();
		b.start();
	}
}