/*14. Merge Two ArrayLists
Problem Statement:
Merge two ArrayList<Integer> into one list.
Input:
List1 = [1,2]
List2 = [3,4]
Output:
Merged List = [1,2,3,4]
Explanation:
Use list1.addAll(list2).
*/

import java.util.*;
public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		System.out.print("enter element list1: ");
		for(int i=0; i<3; i++)
		{
			list1.add(sc.nextInt());
		}
		System.out.print("enter element list2: ");
		for(int i=0; i<3; i++)
		{
			list2.add(sc.nextInt());
		}
		
		list1.addAll(list2);
		
		System.out.print(list1);
	}
}