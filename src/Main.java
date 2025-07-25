//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("************");
            System.out.println("Welcome Back");
            System.out.println("************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("************");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    showBalance(balance);
                case 2 ->
                    System.out.println("Deposit");
                case 3 ->
                    System.out.println("Withdraw");
                case 4 ->
                    isRunning = false;
                default ->
                    System.out.println("Invalid choice");
            }

        }
        // Get and process users choice

        // showBalance()
        // deposit()
        // withdraw()
        sc.close();
    }

    static void showBalance (double balance) {
        
        System.out.printf("your balance is: $%.2f\n", balance);
        
    }
}
