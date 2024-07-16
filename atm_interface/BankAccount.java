package atm_interface;

public class BankAccount{

    private int balance;
    
    public BankAccount(int balance) {
        this.balance = balance;
    }
   
    public void withdraw(int amount){
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

}
