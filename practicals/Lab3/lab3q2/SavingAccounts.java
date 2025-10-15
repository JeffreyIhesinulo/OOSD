package lab3q2;
public class SavingAccounts 
{
    private static int nextAccountNumber = 0;
    private static double annualInterestRate;

    private int accountNumber;
    private double savingsBalance;
    public double monthlyInterest;
    public SavingAccounts(double savingsBalance)
    {
        nextAccountNumber++;
        accountNumber = nextAccountNumber;
        this.savingsBalance = savingsBalance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getSavingsBalance()
    {
        return savingsBalance;
    }
    public double  calculateMonthlyInterest()
    {
        monthlyInterest = (savingsBalance*(annualInterestRate/12));
        savingsBalance+=monthlyInterest;
        return monthlyInterest;
    }
    public static void modifyInterestRate(double newValue)
    {
        annualInterestRate = newValue;
    }
}
