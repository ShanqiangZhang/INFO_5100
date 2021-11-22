package Ass5_Question3;

public class PayPal implements PaymentStrategy{
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(int totalPrice) {
        System.out.println("Paypal : $" + totalPrice);
    }
}
