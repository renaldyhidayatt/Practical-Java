package polymorphism.polymorphism5;

public class TestFieldHidingMethodHiding {
    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin();
        System.out.println(bitcoin.maxDiscountRatio);


        Payment payment = new Bitcoin();
        System.out.println(payment.maxDiscountRatio);

        System.out.println(payment.getAccountNumber());

        
        System.out.println(Payment.getAccountNumber());
        System.out.println(Bitcoin.getAccountNumber());


    }
}
