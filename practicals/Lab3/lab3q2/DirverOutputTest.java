package lab3q2;

public class DirverOutputTest {
    public static void main(String[] args) 
    {
        BankCustomer customer1 = new BankCustomer("Arthas Dodep", "Dubaisk, Vinecia");

        SavingAccounts saver1 = new SavingAccounts(2000.00);
        SavingAccounts saver2 = new SavingAccounts(3000.00);
        SavingAccounts saver3 = new SavingAccounts(1500.00);
        SavingAccounts saver4 = new SavingAccounts(1000.00); // test if the limit works
        customer1.addAccount(saver1);
        customer1.addAccount(saver2);
        customer1.addAccount(saver3);
        customer1.addAccount(saver4); // should show "cannot add more than 3 accounts"
        // Set interest rate to 4% and calculate interest
        SavingAccounts.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver3.calculateMonthlyInterest();
        // Show summary 
        customer1.summary();
        //Set interest rate to 5%
        SavingAccounts.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver3.calculateMonthlyInterest();
        customer1.summary();
        System.out.println("\nCustomer's total savings balance: " + customer1.balance());
    }
}
