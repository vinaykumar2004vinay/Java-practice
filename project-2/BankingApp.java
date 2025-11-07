import java.util.Scanner;

class BankDetails {
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    // Scanner is static to share one instance across all BankDetails objects, 
    // which helps manage the input stream cleanly.
    private static final Scanner sc = new Scanner(System.in); 

    // Method to open a new account
    public void openAccount() {
        // Consume any leftover newline character from previous sc.nextInt() or sc.nextLong() calls
        // This is necessary if openAccount() is called immediately after a sc.nextInt() in main.
        if (sc.hasNextLine()) {
            sc.nextLine(); 
        }
        
        System.out.print("Enter Account No: ");
        // Use nextLine() for strings to allow spaces, though account numbers usually don't have them.
        accno = sc.nextLine(); 
        
        System.out.print("Enter Account type: ");
        acc_type = sc.nextLine();
        
        System.out.print("Enter Name: ");
        // Use nextLine() to correctly read a name with spaces (e.g., "John Doe")
        name = sc.nextLine(); 
        
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextLong();
    }

    // Method to display account details
    public void showAccount() {
        System.out.println("----------------------------------------");
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------------------");
    }

    // Method to deposit money
    public void deposit() {
        // Consume the leftover newline after reading account number in the main method
        if (sc.hasNextLine()) {
            sc.nextLine(); 
        }
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
        System.out.println("Deposit successful. Current Balance: " + balance);
    }

    // Method to withdraw money
    public void withdrawal() {
        // Consume the leftover newline after reading account number in the main method
        if (sc.hasNextLine()) {
            sc.nextLine(); 
        }
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Withdrawal successful. Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + ".\tTransaction failed...!!");
        }
    }

    // Method to search an account number
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return true;
        }
        return false;
    }
}