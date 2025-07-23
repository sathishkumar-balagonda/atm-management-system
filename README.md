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

