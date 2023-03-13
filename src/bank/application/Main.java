package bank.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7;
        HDFC.rateOfInterest = 6;

        //Taking input details from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to SBI. Please enter the details to create account.");

        System.out.println("Enter name : ");
        String name = sc.next();

        System.out.println("Enter balance : ");
        int intialBalance = sc.nextInt();

        System.out.println("Enter password : ");
        String password = sc.next();

        SBI sbiAccount = new SBI(intialBalance, password, name);

        //Entering details manually
        SBI account1 = new SBI(200000, "123", "Rahul");

        SBI account2 = new SBI(150000, "456", "Arun");

        HDFC account3 = new HDFC(100000, "789", "Shalini");

        //Check balance(wrong pw)
        int balance = account1.checkBalance("124");
        System.out.println("Balance in account1 is : " + balance);

        //Check balance
        int balance1 = account1.checkBalance("123");
        System.out.println("Balance in account1 is : " + balance1);

        //Add money
        String bankMessage = sbiAccount.addMoney(50000);
        System.out.println(bankMessage);

        //Withdraw money (wrong pw)
        String message = account3.withdrawMoney(50000, "1234");
        System.out.println(message);

        //Withdraw money
        String message1 = account3.withdrawMoney(50000, "789");
        System.out.println(message1);

        //Change password
        String pw = account2.changePassword("456", "654");

        //Calculate RoI
        double interest = account1.calculateInterest(20);
        System.out.println("Total interest you will get is : "+ interest);

        //Calculate RoI
        double interest1 = account3.calculateInterest(20);
        System.out.println("Total interest you will get is : "+ interest1);

    }
}