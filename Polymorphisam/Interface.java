package Polymorphisam;

interface Payment {
    void pay(double amount); 
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via Credit Card"); 
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via PayPal"); 
    }
}

class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via Bank Transfer");
    }
}

public class Interface {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment(); // Payment interface reference, CreditCardPayment object
        payment.pay(100.0); // Calls CreditCardPayment's pay()

        payment = new PayPalPayment(); // Reassigning reference to PayPalPayment object 
        payment.pay(200.0); // Calls PayPalPayment's pay()

        payment = new BankTransferPayment(); // Reassigning reference to BankTransferPayment object 
        payment.pay(300.0); // Calls BankTransferPayment's pay() 
    }
}