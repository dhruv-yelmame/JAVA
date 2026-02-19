/*Q6. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.
*/


public class Question31
 {
    public static void main(String x[]) 
	{
        int a[] = {2, 4, 6, 8};
        int newArr[] = new int[a.length];

        for (int i = 0; i < a.length; i++) 
		{
            newArr[i] = a[i] * a[i];
        }

        System.out.print("New Array: ");
        for (int i = 0; i < newArr.length; i++) 
		{
            System.out.print(newArr[i] + " ");
        }
    }
}
