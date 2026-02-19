/*Q3. Create a class implementing Runnable that prints "Hello Multithreading" 5 times.
Output:
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading
*/


class MyRunnable implements Runnable 
{

    public void run() 
	{
        for (int i = 1; i <= 5; i++) 
		{
            System.out.println("Hello Multithreading");
        }
    }
}

public class Q3 {

    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}
