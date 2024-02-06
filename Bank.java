public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account information
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating instances of BankAccount
        BankAccount account1 = new BankAccount("123456", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("789012", "Jane Smith", 500.0);

        // Demonstrating usage
        account1.displayInfo();
        account1.deposit(200.0);
        account1.withdraw(150.0);

        System.out.println(); // Adding a line break for clarity

        account2.displayInfo();
        account2.deposit(300.0);
        account2.withdraw(700.0); // This withdrawal will result in an error message due to insufficient balance
    }
}
