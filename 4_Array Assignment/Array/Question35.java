// Q10. Count the number of duck numbers in an array.

public class Question35
{
    public static void main(String x[])
    {
        int a[] = {1, 10, 5, 20, 15, 30};

        int count = 0;

        for(int i = 0; i < a.length; i++)
        {
            int num = a[i];
            boolean isDuck = false;  

           
            while(num != 0)
            {
                int digit = num % 10;  
                if(digit == 0)
                {
                    isDuck = true;  
                    break;           
                }
                num = num / 10;    
            }

            if(isDuck)
            {
                count++;
            }
        }
        System.out.println("Count = " + count);
    }
}
