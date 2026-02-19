/*Q4. Write a program in java to find the smallest missing element from a sorted array?		
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/import java.util.*;

public class Question19 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the values of array (sorted): ");
        for (int i=0; i<a.length; i++)
		{
            a[i] = sc.nextInt();
        }
        System.out.print("The given array is : ");
        for (int i=0; i<a.length; i++) 
		{
            System.out.print(a[i]+" ");
        }
		
        System.out.println();//0 1 2 3 5 6 7 9
		
        int left = 0, right = a.length - 1;
        while(left<=right) //0<=7, 4<=7, 4<=4-f
		{
            int mid = (left + right) / 2;//3, 5
            if (a[mid]==mid)//3=3-t, 6==5-f
			{
                left = mid + 1; //3+1=4
            } 
			else 
			{
                right = mid - 1;//5-1=4
            }
        }

      
        System.out.println("The missing smallest element is: " + left);
    }
}