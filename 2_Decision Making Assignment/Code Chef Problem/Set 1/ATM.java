import java.util.*;
public class ATM
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your balance: ");
    int balance = sc.nextInt();

    System.out.println("enter amount to withdraw: ");
    int amt = sc.nextInt();
    
    int show = balance - amt;
    double FinalAmt = show-0.5;
    
    if(amt>balance)
      {
        System.out.println("Insufficient Funds");
		System.out.println("Balance: "+balance);
      }
    else if(amt%5==0)
      {
		
        System.out.println("Successful Transaction");
        System.out.println("Balance: "+FinalAmt);
      }
    else
      {
       System.out.println("Incorrect Withdrawal Amount (not multiple of 5)");
	   System.out.println("Balance: "+balance);
      }
     
  }
}