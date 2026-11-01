package Week2_Calculator;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }
}

class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        p1.pay(1000);
        p2.pay(2000);
    }
}
