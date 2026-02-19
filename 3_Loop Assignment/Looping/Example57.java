/*Q57. Write a Java program to display the following series:
     1 1 2 3 5 8 13 21 34
(Fibonacci series using loop — first 9 terms)
*/
public class Example57
{ 
    public static void main(String x[]) 
	{
        int n = 9;   
        int a = 1, b = 1;

        System.out.print(a + " " + b + " ");

        for(int i=3; i<=n; i++) 
		{
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}