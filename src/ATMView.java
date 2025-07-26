
import java.util.Scanner;

public class ATMView {
    private Scanner scanner;
    
    public ATMView() {
        scanner = new Scanner(System.in);
    } 

    public void ShowScanner() {
        System.out.println("***************");
        System.out.println("Welcome Back");
        System.out.println("***************");
    }

     public void showMainMenu() {
        System.out.println("********************");
        System.out.println("1. Show balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("********************");
        System.out.print("Enter your choice: ");
    }

    public String getAccountNumber() {
        System.out.println("Enter ur acc number: ");
        return scanner.nextLine();
    }

    public String getPin() {
        System.out.println("Enter ur PIN: ");
        return scanner.nextLine();
    }

    public int getMenuChoice() {
        return scanner.nextInt();
    }

    public double getAmount(String amount) {
        System.out.printf("Enter the amount you want to %s: ", amount);
        return scanner.nextDouble();
    }

     public void showBalance(double balance) {
        System.out.printf("Your balance is: $%.2f\n", balance);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showError(String error) {
        System.err.println("Error: " + error);
    }

    public void clearScannerBuffer() {
        scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
