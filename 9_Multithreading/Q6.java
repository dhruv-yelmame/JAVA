/*Q6. Set thread names as "StudentThread" and "TeacherThread".
Output:
StudentThread is running
TeacherThread is running
Explanation:
Use setName().
*/

class StudentThread extends Thread
{
	public void run()
	{ 
		System.out.println(Thread.currentThread().getName()+" is running");
	}
}

class TeacherThread extends Thread
{
	public void run()
	{
			System.out.println(Thread.currentThread().getName()+" is running");
	}
}

public class Q6
{
	public static void main(String x[])
	{
		StudentThread st = new StudentThread();
		
		st.setName("StudentThread");
		
		st.start();
        
		TeacherThread tt = new TeacherThread();
	
		tt.setName("TeacherThread");
		
		tt.start();
	}
}