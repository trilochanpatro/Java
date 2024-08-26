//Create a class Account with two overloaded constructors. First constructor is used for initializing,
//name of account holder, account number and initial amount in account.
//Second constructor is used for initializing name of account holder, account number, addresses, type of account and current
//balance. Account class is having methods Deposit (), Withdraw (), and Get_Balance(). Make
//necessary assumption for data members and return types of the methods. Create objects of
//Account class and use them.

import java.util.Scanner;

class Account {
    // Data members
    private String accountHolderName;
    private String accountNumber;
    private String address;
    private String accountType;
    private double balance;

    // First constructor: Initializes account holder's name, account number, and initial amount
    public Account(String accountHolderName, String accountNumber, double initialAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    // Second constructor: Initializes account holder's name, account number, address, account type, and current balance
    public Account(String accountHolderName, String accountNumber, String address, String accountType, double currentBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.address = address;
        this.accountType = accountType;
        this.balance = currentBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        if (address != null) {
            System.out.println("Address: " + address);
        }
        if (accountType != null) {
            System.out.println("Account Type: " + accountType);
        }
        System.out.println("Current Balance: " + balance);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the first account
        System.out.println("Enter details for the first account:");
        System.out.print("Enter account holder name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accNumber1 = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double initialAmount1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        // Create the first account using the first constructor
        Account account1 = new Account(name1, accNumber1, initialAmount1);

        // User input for the second account
        System.out.println("\nEnter details for the second account:");
        System.out.print("Enter account holder name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accNumber2 = scanner.nextLine();
        System.out.print("Enter address: ");
        String address2 = scanner.nextLine();
        System.out.print("Enter account type: ");
        String accType2 = scanner.nextLine();
        System.out.print("Enter current balance: ");
        double currentBalance2 = scanner.nextDouble();

        // Create the second account using the second constructor
        Account account2 = new Account(name2, accNumber2, address2, accType2, currentBalance2);

        // Display account details for both accounts
        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();
        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();

        // Perform deposit and withdrawal on the first account
        System.out.print("\nEnter amount to deposit in Account 1: ");
        double depositAmount1 = scanner.nextDouble();
        account1.deposit(depositAmount1);

        System.out.print("Enter amount to withdraw from Account 1: ");
        double withdrawAmount1 = scanner.nextDouble();
        account1.withdraw(withdrawAmount1);

        // Perform deposit and withdrawal on the second account
        System.out.print("\nEnter amount to deposit in Account 2: ");
        double depositAmount2 = scanner.nextDouble();
        account2.deposit(depositAmount2);

        System.out.print("Enter amount to withdraw from Account 2: ");
        double withdrawAmount2 = scanner.nextDouble();
        account2.withdraw(withdrawAmount2);

        // Display final balances
        System.out.println("\nFinal Balance of Account 1: " + account1.getBalance());
        System.out.println("Final Balance of Account 2: " + account2.getBalance());

        scanner.close();
    }
}
