/*Q51. Write a java program to display following series :
           	1  2  2  4  3  6  4  8  5  10  6  12
*/

public class Example51 
{
    public static void main(String x[]) 
	{
        
        for (int i=1; i<=6; i++) 
		{
            System.out.print(i + " ");      // first number
            System.out.print((i * 2) + " "); // second number
        }
    }
}