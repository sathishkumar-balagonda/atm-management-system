package atm;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ATMOperations {

    Connection conn;

    public ATMOperations(Connection c) {
        conn = c;  // Save the connection from DatabaseConnection class
    }

    // Method to check balance
    public void checkBalance(int accountNo) {
        try {
            Statement stmt = conn.createStatement();  // Create a statement
            String query = "SELECT balance FROM users WHERE account_no = " + accountNo;
            ResultSet rs = stmt.executeQuery(query);  // Execute the query

            while (rs.next()) {   // Read the result
                double bal = rs.getDouble("balance");
                System.out.println("Your Balance is: " + bal);
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error in Check Balance");
        }
    }

    // Method to deposit amount
    public void deposit(int accountNo, double amount) {
        try {
            Statement stmt = conn.createStatement();
            String query = "UPDATE users SET balance = balance + " + amount + " WHERE account_no = " + accountNo;
            int rows = stmt.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Deposit Successful! Amount Deposited: " + amount);
            } else {
                System.out.println("Deposit Failed! Account Not Found.");
            }

            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error in Deposit");
        }
    }

    // Method to withdraw amount
    public void withdraw(int accountNo, double amount) {
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT balance FROM users WHERE account_no = " + accountNo;
            ResultSet rs = stmt.executeQuery(selectQuery);

            double balance = 0;
            boolean accountFound = false;

            while (rs.next()) {
                balance = rs.getDouble("balance");
                accountFound = true;
            }

            if (accountFound == true) {
                if (balance >= amount) {
                    String updateQuery = "UPDATE users SET balance = balance - " + amount + " WHERE account_no = " + accountNo;
                    stmt.executeUpdate(updateQuery);
                    System.out.println("Withdrawal Successful! Amount Withdrawn: " + amount);
                } else {
                    System.out.println("Insufficient Balance!");
                }
            } else {
                System.out.println("Account Not Found!");
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error in Withdraw");
        }
    }
}