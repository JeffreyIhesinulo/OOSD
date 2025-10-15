package lab3q2;

public class BankCustomer {
    private String name;
    private String address;
    private SavingAccounts[] accounts; //array of accounts 
    private int numAccounts;

    public BankCustomer(String name, String address) 
    {
        this.name = name;
        this.address = address;
        this.accounts = new SavingAccounts[3];

    }
    public void addAccount(SavingAccounts account)
    {
        if (numAccounts < 3)
        {
            accounts[numAccounts] = account;
            numAccounts++;
            System.out.println("Account "+ account.getAccountNumber()+ " added for "+name);

        }
        else
        {
            System.out.println("can not create more tahn 3 accounts for "+name);
        }
    }
    public double balance()
    {
        double total = 0;
        for (int index = 0; index < numAccounts; index++) 
        {
            total += accounts[index].getSavingsBalance();
        }
        return total;
    }
     public void summary()
    {
        System.out.println("\nCustomer Summary for " + name + ":");
        System.out.println("Address: " + address);
        for (int i = 0; i < numAccounts; i++) 
        {
            System.out.println("Account " + accounts[i].getAccountNumber() + "Balance:" + accounts[i].getSavingsBalance());
                              
        }
        System.out.println("Total Balance: " + balance());
    }
    

    
}