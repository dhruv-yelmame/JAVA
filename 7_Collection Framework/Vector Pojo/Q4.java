package com.vectorPojo;
import java.util.*;
class BankAccount 
{
	public BankAccount(int accountNo, String holderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	private int accountNo;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private String holderName;
	private double balance;
	
}
public class Q4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Vector v = new Vector();
	
	v.add(new BankAccount(1,"Dhruv",6500.0));
	v.add(new BankAccount(2,"Ram",4000.0));
	v.add(new BankAccount(3,"Dhiraj",10000.0));
	v.add(new BankAccount(4,"Venki",1000.0));
	double newBalance = 0;
	
	do {
		System.out.println("1.Deposit amount to an account");
		System.out.println("2.Withdraw amount if balance is sufficient");
		System.out.println("3.Display accounts with balance < 5000");
		
		System.out.print("enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.print("Enter Amount: ");
			double amount = sc.nextDouble();
			System.out.print("enter account number: ");
			int ac = sc.nextInt();
			boolean found = false;
			for(Object obj : v)
			{
				BankAccount b = (BankAccount )obj;
				if(ac==b.getAccountNo())
				{
					newBalance = amount + b.getBalance();
					b.setBalance(newBalance);
					System.out.println("Deposit Successful");
					System.out.println("New Balance: "+b.getHolderName()+"\t"+newBalance);
					found = true;
					break;
				}
			}
			
			if(!found)
				System.out.println("Invalid Account Number");
			break;
			
		case 2:
			System.out.print("enter account number: ");
			ac = sc.nextInt();
			found=false;
			for(Object obj : v)
			{
				BankAccount b = (BankAccount)obj;
				if(ac==b.getAccountNo())
				{
					found=true;
					System.out.print("enter amount to withdraw: ");
					amount = sc.nextDouble();
					
					if(amount <= b.getBalance())
					{
						newBalance = b.getBalance() - amount;
						b.setBalance(newBalance);
						System.out.println("Withdrawal Successful");
						System.out.println("New Balance: "+b.getHolderName()+"\t"+newBalance);
						break;
					}
					else
					{
						System.out.println("Insufficient Balance");
						break;
					}
				}
			}
			if(!found)
				System.out.println("Id does not found");		
			break;
		case 3:
			for(Object obj : v)
			{
				BankAccount b = (BankAccount)obj;
				if(b.getBalance() < 5000)
				{
					System.out.println(b.getAccountNo()+"\t"+b.getHolderName()+"\t"+b.getBalance());
				}
			}
			break;
		default:
				System.out.println("Invalid Choice");
		}
		
	}while(true);
	
	}
}
