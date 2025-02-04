import java.util.*;

class Bank {
    public static void main(String[] args) {
        BankingSystem bs = new BankingSystem(1234567890, "Aditi", 1000);
        bs.addBalance(500);
        bs.withdraw(200);
        bs.display();
        
        if (bs.checkBalance()) {
            System.out.print("paisa hi paisa");
        } else {
            System.out.print("garib hai appan");
        }
    }
}

class BankingSystem {
    private int accNumber;
    private String accHolderName;
    private int accountBalance;

    public BankingSystem(int accNumber, String accHolderName, int accountBalance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.accountBalance = accountBalance;
    }

    void addBalance(int balance) {
        if (balance > 0) {
            accountBalance += balance;
        } else {
            System.out.println("paise ni h to yaha ku aya");
        }
    }

    int withdraw(int balance) {
        if (balance > accountBalance) {
            System.out.println("Bhai paise to dal de pahle");
        } else {
            accountBalance -= balance;
        }
        return accountBalance;
    }

    boolean checkBalance() {
        return accountBalance > 0;
    }

    public void display() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
}
