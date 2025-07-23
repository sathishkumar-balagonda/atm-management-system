# 🏦 ATM Management System

A *console-based Java application* that lets users perform essential banking tasks like balance inquiry, deposit, and withdrawal using a *MySQL* database and *JDBC* for real-time updates.

---

## ✨ Features

- 🧾 *Balance Inquiry* – Check current account balance
- 💰 *Cash Deposit* – Add money to the account
- 🏧 *Cash Withdrawal* – Withdraw money with balance validation
- 🔌 *MySQL Connectivity* – Uses JDBC to connect Java with a MySQL database
- ⚠ *Exception Handling* – Catches errors like invalid input or connection issues

---

## 🔧 Technologies Used

- ☕ Java (Core Concepts)
- 🔗 JDBC (Java Database Connectivity)
- 🛢 MySQL Database
- 💻 Eclipse IDE

---

## ⚙ How It Works

- 🔐 The user logs in using credentials stored in the MySQL database.
- 🧾 User selects an operation like deposit, withdrawal, or balance check.
- 🔄 The system processes the input and updates or reads data in real-time using JDBC.
- ✅ Proper validations and exception handling are implemented.

---

## 🗂 Project Structure

ATMApp.java              --> Main class that starts the ATM application
ATMOperations.java       --> Handles all banking operations (deposit, withdrawal, balance check)
DatabaseConnection.java  --> Manages connection to the MySQL database using JDBC
README.md                --> This file. Contains project documentation

---

## 🛠 Setup Instructions

1. 📥 *Clone this repository*  
   Download the project to your computer by running the following command:
   git clone
   https://github.com/sathishkumar-balagonda/ATM-Management-System.git
2. 💻 *Open the project in Eclipse IDE*  
- Open Eclipse (or any Java IDE)
- Click File → Import → Existing Projects into Workspace
- Select the folder you just cloned

3. 🛢 *Set up MySQL Database*  
- Open MySQL
- Create a database (e.g., atm_db)
- Create a table (e.g., users) with the following columns:
  - id (INT, PRIMARY KEY)
  - name (VARCHAR)
  - pin (INT)
  - balance (DOUBLE)
- Insert a sample user:
  sql
  INSERT INTO users (id, name, pin, balance) VALUES (1, 'Sathish', 1234, 5000.00);
  
4. ✏ *Update credentials in DatabaseConnection.java*  
Inside your DatabaseConnection.java, make sure this part looks like:
```java
 String url = "jdbc:mysql://localhost:3306/atm_db";
String user = "root"; // or your MySQL username
String password = "yourpassword"; // your MySQL password

5. ▶ *Run the Application (Console-Based)*  
   - In Eclipse, right-click on ATMApp.java  
   - Select Run As → Java Application  
   - The app will run in the console window (text-based interface)  
   - Use the sample user details to log in and try all features
---

