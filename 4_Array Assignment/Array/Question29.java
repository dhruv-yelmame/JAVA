/*Q4. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true
*/

public class Question29
{
	public static void main(String x[])
	{
		int a[] = new int[]{1, 2, 3, 2, 1};
		int i;
		int b[] = new int[a.length];
		for(i=0; i<a.length; i++) 
		{
            b[i] = a[i];
        }
		System.out.print("The given Array is: ");
		for(i=0; i<a.length; i++) 
		{
			System.out.print(b[i]+" ");
        }

		int mid = a.length/2;
		int end = a.length-1;
		for(i=0; i<mid; i++)
		{
			int temp = a[i];
			a[i] = a[end];
			a[end] = temp;
			end--;
		}
		System.out.println();
		boolean isPalindrome = true;
		
		for(i=0; i<a.length; i++)
		{
		if(a[i]!=b[i])
			isPalindrome = false;
		}
	
		if (isPalindrome)
            System.out.print("true");
        else
            System.out.print("false");
			
	}
}