package atm;

import java.sql.Connection;
import java.util.Scanner;

public class ATMApp {

    public static void main(String[] args) {

        DatabaseConnection db = new DatabaseConnection();
        Connection conn = db.connect();

        if (conn != null) {
            ATMOperations atm = new ATMOperations(conn);
            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to ATM Machine");
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            int choice = 0;
            while (choice != 4) {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    atm.checkBalance(accNo);
                } else if (choice == 2) {
                    System.out.print("Enter Amount to Deposit: ");
                    double amount = sc.nextDouble();
                    atm.deposit(accNo, amount);
                } else if (choice == 3) {
                    System.out.print("Enter Amount to Withdraw: ");
                    double amount = sc.nextDouble();
                    atm.withdraw(accNo, amount);
                } else if (choice == 4) {
                    System.out.println("Thank you for using ATM!");
                } else {
                    System.out.println("Invalid Choice. Try again.");
                }
            }

            sc.close();
        } else {
            System.out.println("Database Connection Failed. Exiting...");
        }
    }
}
