/*Q56. Write a Java program to display the following series:
		7   10   15   22   31   42   55   70
      (Start at 7, differences increasing by 1 each time: +3, +5, +7...)
*/
public class Example56
 {
    public static void main(String x[]) 
	{
        int n = 8;   
        int num = 7; 
        int diff = 3;

        System.out.print(num + " ");

        for(int i=1; i<n; i++) 
		{
            num = num + diff;
            System.out.print(num + " ");
            diff += 2; 
        }
    }
}
