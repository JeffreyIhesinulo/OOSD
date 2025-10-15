package lab3q2;

public class Lab3Q2 {
    public static void main(String[] args) 
    {
        SavingAccounts saver1 = new SavingAccounts(2000);
        SavingAccounts saver2 = new SavingAccounts(3000);
        SavingAccounts.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("the first account number"+saver1.getAccountNumber()+" the saving balance "+ saver1.getSavingsBalance());
        System.out.println("the second account number"+saver2.getAccountNumber()+" the saving balance "+ saver2.getSavingsBalance());
        SavingAccounts.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("the first account number"+saver1.getAccountNumber()+" the saving balance "+ saver1.getSavingsBalance());
        System.out.println("the second account number"+saver2.getAccountNumber()+" the saving balance "+ saver2.getSavingsBalance());
        
        
        
    }
    
}
