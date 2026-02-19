/*Q54. Write a java program to display following series :
           	1  2  4  7  11  16  22  29  37  46.
*/


public class Example54
{
    public static void main(String x[]) 
	{
        int n = 10; 
        int num = 1;

        for(int i=0; i<n; i++) 
		{
            num = num + i; 
            System.out.print(num + " ");
        }
    
	}

}