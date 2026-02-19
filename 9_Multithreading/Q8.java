/*Q8. Create two threads with priority 1 and 10. Print their priority.
 Explanation :- Use setPriority().
*/

class FirstPriority extends Thread
{
	public void run()
	{
		System.out.println("FirstPriority: "+Thread.currentThread().getPriority());
	}
}

class LastPriority extends Thread
{
	public void run()
	{
		System.out.println("LastPriority: "+Thread.currentThread().getPriority());
	}
}

public class Q8
{
	public static void main(String x[])
	{
		FirstPriority fp = new FirstPriority();
		fp.setPriority(1);
		fp.start();
		
		LastPriority lp = new LastPriority();
		lp.setPriority(10);
		lp.start();
	}
}