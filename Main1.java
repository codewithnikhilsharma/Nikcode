package Now;
 abstract class BankAccount {
    protected String accountNumber;
    protected double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public abstract void deposit(double amount);
    
    public abstract void withdraw(double amount);
}

 class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }
}



public class Main1 {

	    public static void main(String[] args) {
	        CheckingAccount checkingAccount = new CheckingAccount("123456789", 1000.0);
	        checkingAccount.deposit(500.0);
	        checkingAccount.withdraw(200.0);
	    }
	}

