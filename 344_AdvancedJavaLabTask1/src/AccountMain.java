class Account {
    String accountNumber;
    double balance;

    // Parameterized constructor
    Account(String accountNumber, double balance) {
        // Validate account number
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty!");
            this.accountNumber = "Invalid"; // Optional default value
        } else {
            this.accountNumber = accountNumber;
        }

        // Validate balance
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative!");
            this.balance = 0; // Optional default value
        } else {
            this.balance = balance;
        }
    }

    // Display account info
    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

public class AccountMain {
    public static void main(String[] args) {
        // Test cases

        Account acc1 = new Account("ACC123", 5000);  // valid
        Account acc2 = new Account("", 2000);        // invalid account number
        Account acc3 = new Account("ACC456", -100);  // invalid balance
        Account acc4 = new Account(null, -50);       // both invalid

        System.out.println("\nAccount Details:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
        acc3.displayAccountInfo();
        acc4.displayAccountInfo();
    }
}
