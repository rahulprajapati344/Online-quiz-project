import java.util.Scanner;

public class Quiz {

    private double balance;
    public Quiz() {
        this.balance = 0.0; 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs." + amount + " has been deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rs." + amount + " has been withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Please try again.");
        } else {
            System.out.println("Invalid withdrawal amount. Please try again.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: Rs." + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz bankAccount = new Quiz();
        System.out.println("Welcome to the Simple Banking Application!");
        boolean exit = false;
        while (!exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: Rs.");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: Rs.");
                    double withdrawAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    bankAccount.checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Simple Banking Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
