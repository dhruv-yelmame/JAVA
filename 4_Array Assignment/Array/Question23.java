/*Q3. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
			  arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]
Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.
*/


import java.util.*;
public class Question23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two size: ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int a[]=new int[size1];
        int b[]=new int[size2];
        System.out.print("enter the elements in arr 1: ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
         System.out.print("enter the elements in arr 2: ");
        for(int i=0; i<b.length; i++)
        {
            b[i]=sc.nextInt();
        }
        
		//merge into c
        int c[] = new int[size1+size2];
        int k=0;
        for(int i=0; i<a.length; i++)
            c[k++]=a[i];
        for(int i=0; i<b.length; i++)
            c[k++]=b[i];
        
		//step 1: sort arr
        for(int i=0; i<c.length; i++)
        {
            for(int j=i+1; j<c.length; j++)
            {
                if(c[i]>c[j])
                {
                    int temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        // step 2: Print unique values
        System.out.print(c[0] + " ");
        for(int i = 1; i < c.length; i++) 
		{
            if(c[i] != c[i - 1]) 
			{
                System.out.print(c[i] + " ");
	        }
		}
	}
}