class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        try {
            withdraw(5000, 3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
