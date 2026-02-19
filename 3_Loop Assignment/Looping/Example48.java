/* Q48. Task: Take an integer n and an integer k. Rotate the number n by k places to the left without using arrays or strings.
Example: n = 123456, k = 2 → output 345612.
Hint: Use modulus and division to split and rearrange digits.*/
 
 
import java.util.*;
public class Example48
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();  // 123456

        System.out.print("Enter left rotations (k): ");
        int k = sc.nextInt();  // 2

        int temp = n;
        int digits = 0;

        // count digits
        while(temp>0) 
		{
            digits++;
            temp /= 10;
        }

        k = k % digits; // to handle large k

        int pow = 1;
        for(int i=1; i<=digits-k; i++) 
		{
            pow *= 10;
        }

        int left = n / pow;   // first k digits
        int right = n % pow;  // remaining digits

        int rotated = right * (int)Math.pow(10, k) + left;

        System.out.println("Rotated number = " + rotated);
    }
}
