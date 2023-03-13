package bank.application;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7;
        HDFC.rateOfInterest = 6;

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
        String bankMessage = account2.addMoney(50000);
        System.out.println(bankMessage);

        //Withdraw money (wrong pw)
        String message = account3.withdrawMoney(50000, "1234");
        System.out.println(message);

        //Withdraw money
        String message1 = account3.withdrawMoney(50000, "789");
        System.out.println(message1);

        //Calculate RoI
        double interest = account1.calculateInterest(20);
        System.out.println("Total interest you will get is : "+ interest);

        //Calculate RoI
        double interest1 = account3.calculateInterest(20);
        System.out.println("Total interest you will get is : "+ interest1);
    }
}