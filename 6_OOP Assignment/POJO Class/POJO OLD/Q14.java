/*Q14. Given two arrays, our task is to find their common elements. 
 Input:  Array1 = [“a”, “b”, “c”, “d”, “e”, “f”],
         Array2 = [“b”, “d”, “e”, “h”, “g”, “c”]
Output: [b, c, d, e]
Your Task :
You have to create class names s FindCommonElements with following methods 
void setArray(int a[],int b[]); this function can accept two array as parameter 
Int [] getCommonElements(): you have to create a new third array and find the common element and return it.
*/

import java.util.*;
class FindCommonElements
{
	private String []a;
	private String []b;
	public void setArray(String a[],String b[])
	{
		this.a=a;
		this.b=b;
	}
	
	public String[] getCommonElements()
	{
		String temp[] = new String[a.length]; 
		int k=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i].equals(b[j]))
				{
					temp[k++]=a[i];
				}
			}
		
		}
		
		 String res[] = new String[k];
		
		for(int i=0; i<k; i++)
		{
			res[i]=temp[i];
		}
		
		return res;
	}
}

public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		String a[] = new String[6];
		String b[] = new String[6];
		String c[] = new String[a.length];
		System.out.print("enter the elements in array1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.next();
		}
		System.out.print("enter the elements in array2: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.next();
		}
		
		FindCommonElements co = new FindCommonElements();
		co.setArray(a,b);
		 String res [] = co.getCommonElements();
		
		for(int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
	}
}