package Task3;

import java.util.Scanner;
import java.util.Random;

public class ATMtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account number to log in: ");
        String accountNumber = sc.nextLine();

        //Generate automatically balance between 10 and 5000 euros
        Random rand = new Random();
        double currentBalance = 10 + (5000 - 10) * rand.nextDouble();
        System.out.printf("Your current balance is: %.2f euros%n", currentBalance);

        UserBankAccount userAccount = new UserBankAccount(accountNumber, currentBalance);
        ATM atm = new ATM(userAccount);

        while (true) {
            System.out.println("\nType:\n" +
                    "     'view', for just checking the balance\n" +
                    "     'deposit', if you want to deposit money\n" +
                    "     'withdraw', if you want to withdraw money\n" +
                    "or type: \n" +
                    "     'exit' if you want to exit!\n");

            String choice = sc.next().toLowerCase();

            if (choice.equals("exit")) {
                System.out.println("Logging out... Goodbye!");
                break;
            }

            switch (choice) {
                case "view":
                    atm.viewBalance();
                    break;

                case "deposit":
                    System.out.println("Enter the amount to deposit: ");
                    atm.depositMoney(getAmountFromUser());
                    break;

                case "withdraw":
                    System.out.println("Enter the amount to withdraw: ");
                    atm.withdrawMoney(getAmountFromUser());
                    break;

                default:
                    System.out.println("Invalid choice! Please try again!");
            }
        }

        sc.close();
    }

    public static double getAmountFromUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
