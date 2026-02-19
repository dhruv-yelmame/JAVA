/*Q13. Create a BankAccount class with:
accountNumber, holderName, balance, lastTransactionAmount

Parameterized constructor.
Logic Method: isFraudAlert()
 Return true when ANY condition matches:
lastTransactionAmount > 50% of balance
lastTransactionAmount > 50000
More than 3 transactions above ₹10,000 in a row (use an int counter passed to constructor)
balance suddenly dropped by more than 40% (use previousBalance passed to constructor)
Task:
 Create objects with different values.
 Check fraud alert result.
Expected Learning: Complex logical combinations (&&, ||), constructor usage, real-world reasoning.
*/
class BankAccount
{
    private int accountNumber;
    private String holderName;
    private double balance;
    private double lastTransactionAmount;
    private int highValueTxnCount;      // > 10000 counter
    private double previousBalance;

    BankAccount(int accountNumber, String holderName, double balance,double lastTransactionAmount, 
					 int highValueTxnCount, double previousBalance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.lastTransactionAmount = lastTransactionAmount;
        this.highValueTxnCount = highValueTxnCount;
        this.previousBalance = previousBalance;
    }

    boolean isFraudAlert()
    {
        if (lastTransactionAmount > balance * 0.5)
            return true;

        if (lastTransactionAmount > 50000)
            return true;

        if (highValueTxnCount > 3)
            return true;

        if ((previousBalance - balance) > previousBalance * 0.4)
            return true;

        return false;
    }
}

public class Q13
{
    public static void main(String[] args)
    {
        BankAccount ba1 = new BankAccount(12, "Dhruv", 60000, 35000, 2, 100000);

        BankAccount ba2 = new BankAccount(74, "Shri", 20000, 12000, 4, 35000);

        BankAccount ba3 = new BankAccount(69, "Ganesh", 30000, 8000, 1, 60000);

        System.out.println("BA1 Fraud Alert: " + ba1.isFraudAlert());
        System.out.println("BA2 Fraud Alert: " + ba2.isFraudAlert());
        System.out.println("BA3 Fraud Alert: " + ba3.isFraudAlert());
    }
}
