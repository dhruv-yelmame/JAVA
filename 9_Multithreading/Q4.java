/*Q4. Create a thread that prints numbers from 1–5 with 1-second delay between each number.
Output:
1 (1 sec delay)
2 (1 sec delay)
...
*/

class Print extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(i+" "+"("+"1 sec delay"+")");
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

public class Q4
{
	public static void main(String x[]) throws InterruptedException
	{
		Print p = new Print();
		p.start();
	}
}