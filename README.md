ATM Management System for Commercial Bank of Ethiopia
Overview
The ATM Management System is a Java-based application developed for the Commercial Bank of Ethiopia (CBE). This application simulates and manages various operations typically found in an ATM machine, including customer registration, account login, balance checking, deposits, withdrawals, PIN change, and transaction management. The system is designed with an intuitive graphical user interface (GUI) and command-line operations to simulate real-world ATM usage for bank customers.

The goal of this project is to provide the Commercial Bank of Ethiopia with a robust, secure, and efficient solution for handling ATM transactions.

Features
The ATM Management System includes the following core features tailored for customers of Commercial Bank of Ethiopia:

Customer Registration: New customers can create an account by providing personal details and setting up a unique username and PIN.

Login/Authentication: Customers can log into the system using their credentials (username and PIN).

Balance Inquiry: Customers can check the available balance in their accounts at any time.

Deposits: Customers can deposit funds into their own accounts or transfer money to other accounts.

Withdrawals: Customers can withdraw money from their accounts, with limits applied based on account type and balance.

PIN Change: Customers can securely change their ATM PIN.

Mini Statement: Customers can view recent transactions and account activity in the form of a mini statement.

Money Transfer: Customers can transfer funds to other Commercial Bank of Ethiopia accounts.

ATM User Interface: The system provides a user-friendly interface that supports interactive ATM operations.

Installation Steps
To set up and run the ATM Management System for Commercial Bank of Ethiopia, follow these steps:

Prerequisites:
Java Development Kit (JDK) version 8 or later must be installed.

Git for cloning the repository.

A terminal/command prompt to compile and run the program.

Step-by-Step Guide:
Clone the repository:

Clone the ATM Management System repository to your local machine using Git:

run this from bash
 
git clone https://github.com/your-username/ATM-Management-System.git
Replace your-username with your actual GitHub username or the repository URL.

Navigate to the project directory:

Open a terminal and change the directory to where the project has been cloned:

run this  from bash
 
cd ATM-Management-System/src/atm_/management_/system
Compile the Java files:

Use the javac command to compile all Java files in the directory:

run this  from bash
javac *.java
Run the application:

After compiling, you can start the ATM Management System using the java command:

run this  from bash
java ATM
This will launch the ATM system, and you can interact with it through the GUI or command-line interface.

File Descriptions
Here’s a detailed description of the core Java files in the ATM Management System:

1. ATM.java:
Description: The entry point of the application that initializes and runs the ATM system. It handles user input and manages the flow of the program, such as user registration, login, and transaction handling.

Purpose: This file contains the main method that controls the overall operation of the ATM system.

2. CustomerAccount.java:
Description: Handles customer data, including account details, balance information, and transaction history. It includes methods for account creation, balance management, and more.

Purpose: Stores and manages customer-related operations such as deposits, withdrawals, and account inquiries.

3. DepositScene.java:
Description: Manages the deposit functionality. Allows customers to deposit money into their accounts or transfer funds to other accounts within the Commercial Bank of Ethiopia.

Purpose: Facilitates deposits and ensures the correct balance update.

4. WithdrawalScene.java:
Description: Handles the logic for withdrawals from the customer's account.

Purpose: Processes withdrawal requests, updates the account balance, and ensures transactions comply with withdrawal limits.

5. Change_pin.java:
Description: Manages the functionality for changing the ATM PIN.

Purpose: Ensures customers can securely update their ATM PIN for account protection.

6. Mainmenu.java:
Description: Displays the main menu for the ATM system once the customer is logged in. This is the central interface where users can choose to check their balance, make withdrawals, or perform other actions.

Purpose: Provides the user with available options after successful authentication.

7. Ministatement.java:
Description: Provides customers with a mini statement of their recent transactions (deposits, withdrawals, transfers).

Purpose: Displays recent transaction history for customer reference.

8. Customer_registration.java:
Description: Handles the registration of new customers by collecting their details and initializing an account for them.

Purpose: Enables the creation of new user accounts in the ATM system.

9. LoginerrorScene.java:
Description: Handles errors during the login process, such as incorrect PIN or username.

Purpose: Provides feedback and error messages when users fail to log in.

Contribution Guidelines
The ATM Management System is intended to support the Commercial Bank of Ethiopia's ATM operations. If you are interested in contributing to the development or improving the system, please follow these guidelines:

Fork the repository and create a branch for your feature.

Make your changes and commit them.

Submit a pull request explaining your changes.

Reporting Issues:
If you encounter any bugs or issues, please open an issue in the GitHub repository and describe the problem you're facing. We will work to resolve it as quickly as possible.

