import java.util.*;
public class Example1
{
   public static void main(String x[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter your character: ");
     char c = sc.nextLine().charAt(0);

     if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' || c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U')
       {
        System.out.println(c+" is  vowel");
       }
     else
       {
        System.out.println(c+" is consonant ");
       }
   }
}