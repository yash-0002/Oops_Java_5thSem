class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    long getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit failed: amount must be positive");
        } else {
            balance += amount;
            System.out.println("Deposited " + amount + ", balance = " + balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw failed: amount must be greater than zero");
        } else if (amount > balance) {
            System.out.println("Withdraw failed: insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", balance = " + balance);
        }
    }
}

public class Practical10 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Anjali Desai", 1002345678L, 5000);

        System.out.println("Account Holder : " + acc.getAccountHolder());
        System.out.println("Account Number : " + acc.getAccountNumber());
        System.out.println("Opening Balance: " + acc.getBalance());
        System.out.println();

        acc.deposit(2000);
        acc.deposit(-500);
        acc.withdraw(1500);
        acc.withdraw(0);
        acc.withdraw(-100);
        acc.withdraw(10000);

        System.out.println();
        System.out.println("Final Balance: " + acc.getBalance());
        System.out.println("Fields are private so balance can only change through deposit() and withdraw().");
    }
}
