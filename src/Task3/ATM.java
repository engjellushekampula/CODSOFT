package Task3;

public class ATM {
    private UserBankAccount account;

    // constructor
    public ATM(UserBankAccount account) {
        this.account = account;
    }

    public void depositMoney(double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(double amount) {
        account.withdraw(amount);
    }

    public void viewBalance() {
        account.checkBalance();
    }
}
