/*Q13. WAP to create class name as Search with two functions 
 boolean isPresent(int  key,int …value): this function can search the key present in an
array or not if present returns true otherwise return false.
*/

import java.util.*;
class Search
{
	private int []a;
	public void setValue(int ...x)
	{
		this.a=x;
	}
	
	public boolean isPresent(int skey)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==skey)
			{
				return true;
			}	
		}
		return false;
	}
}

public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the elements: ");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("enter the element to search: ");
		int skey = sc.nextInt();
		
		Search s = new Search();
		s.setValue(a);
		boolean res = s.isPresent(skey);
		
		if(res)
			System.out.print("Present");
		else
			System.out.print("Not Present");
	}
}