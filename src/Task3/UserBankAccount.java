package Task3;

public class UserBankAccount {
        private String accountNumber;
        private double balance;

        // Constructor
        public UserBankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Successfully deposited " + amount + " euros!");
                System.out.println("Your new balance: "+balance+ " euros!");
            } else {
                System.out.println("Invalid deposit amount!");
            }
        }

        // Method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrawn " + amount + " euros!");
                System.out.println("Your new balance: "+balance+" euros!");
            } else if (amount > balance) {
                System.out.println("Insufficient funds! You have only " + balance + " euros.");
            } else {
                System.out.println("Invalid withdrawal amount!");
            }
        }

        // Method to generate current balance
        public void checkBalance() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: " + balance + " euros");
        }

        // Getter to get the balance
        public double getBalance() {
            return balance;
        }
    }