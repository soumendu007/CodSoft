package atm_interface;

import java.util.*;

public class ATM {

    public BankAccount bankAcc;

    public ATM(BankAccount bankAccount) {
        bankAcc = bankAccount;
    }

    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (bankAcc.getBalance() < amount) {
            System.out.println("Insufficient funds");
        }
        else if(amount < 100 && amount%100!=0)
        {
        	System.out.println("Please enter withdraw amount which is multiple of 100.");
        }
        else
        {
        bankAcc.withdraw(amount);
        System.out.println("Amount Withdraw Sucessfully "+amount);
        }
        
    }

    public void deposit() {
        System.out.println("Enter the amount you want to deposit: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        bankAcc.deposit(amount);
        System.out.println("Amount Deposited Sucessfully "+amount);
        
    }

    private void checkBalance() {
        System.out.println("Your account balance is: "+bankAcc.getBalance());
    }

    public static void main(String[] args){
    	Scanner sc1 = new Scanner(System.in);
    	System.out.println("Enter User's Initial Bank Account Ballence: ");
    	int bankBallence=sc1.nextInt();
        BankAccount bankAccount = new BankAccount(bankBallence);
        ATM atm = new ATM(bankAccount);

        int choice;
        Scanner sc2 = new Scanner(System.in);
        do
        {
        System.out.println("ATM Menu");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.println("Please enter your choice: ");
        choice = sc2.nextInt();

        switch (choice) {
            case 1:
            	atm.withdraw();
                break;
            case 2:
            	atm.deposit();
                break;
            case 3:
            	atm.checkBalance();
                break;
            case 4:
            	System.out.println("Thank you! I hope your user experience is good.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        	}
        
        }while(choice!=4);
        sc1.close();
        sc2.close();
    }

}
