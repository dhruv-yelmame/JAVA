/*Q2. Write a program in java to find the majority element of an array ?
	A majority element in an array of size n is an element that appears more than n/2 times (and
	hence there is at most one such element).
	Expected Output:
	The given array is: 4  8  4  6  7  4  4  8
	There are no Majority Elements in the given array
*/



import java.util.*;
public class Question17
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of arr: ");
        int size = sc.nextInt();
        
        int a[] = new int[size];
        
        System.out.print("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        
		int majoratyCount=size/2;
		int majoratyElement=0;
		boolean found = false;
        for(int i=0; i<size; i++)
		{
			int count=0;
			for(int j=0; j<size; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					majoratyElement=a[i];
				}
				
				if(count>majoratyCount)
				{
					majoratyElement=a[i];
					found = true;
					break;
				}
			
			}
		}
		
		if(found)
		{
			System.out.print("Majority element is: "+majoratyElement);
		}
		else
		{
			System.out.print("No Majority element");
		}
		
		
    }
}

