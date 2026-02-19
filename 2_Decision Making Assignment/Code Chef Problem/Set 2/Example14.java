import java.util.*;
public class Example14
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Total no of Monkeys: ");
    int n = sc.nextInt();
    
    System.out.println("Number of eatable Bananas by Single Monkey: ");
    int k = sc.nextInt();

    System.out.println("Number of eatable Peanuts by single Monkey: ");
    int j = sc.nextInt();

    System.out.println("Total number of Bananas: ");
    int m = sc.nextInt();

    System.out.println("Total number of Peanuts: ");
    int p = sc.nextInt();
    
    int mb = m/k;
	if(m%k !=0)
         {
           mb++;
         }
       

    int mp = p/j;

        if(p%j !=0)
         {
           mp++;
         }

    int total =  n - mb - mp;
    System.out.println("Number of Monkeys left on the tree: "+total);
    

  }
}