package lab5;

public class DynamicPolymorphism {
    interface Payment {
        void pay(double amount);
    }
    static class CreditCard implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card.");
        }
    }
    static class UPI implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using UPI.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Payment p;
        p = new CreditCard();
        p.pay(260.78);
        p = new UPI();
        p.pay(280.97);
    }
}
