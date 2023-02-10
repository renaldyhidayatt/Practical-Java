package polymorphism.polymorphism6;

public class TestUpcastingDowncasting {
    public static void main(String[] args) {

        Payment payment = new Bitcoin();
        Bitcoin bitcoin = new Bitcoin();
        Payment bitCoinPayment = (Payment) bitcoin;

        System.out.println(bitcoin.oneBitcoin);
        System.out.println(bitcoin.exchangeBitcoin(10));

        payByAnything(new Cash());
        payByAnything(new Bitcoin());
        payByAnything(new Payment());

        Payment[] payments = {new Payment(), new Bitcoin(), new Cash()};

        for (Payment p : payments) {
            System.out.println(p.getAccountNumber());
        }

        
        System.out.println(((Bitcoin) bitCoinPayment).oneBitcoin);
        System.out.println(((Bitcoin) bitCoinPayment).exchangeBitcoin(10));

        Payment myPayment = new Payment();

        if (myPayment instanceof Bitcoin) {
            System.out.println(((Bitcoin) myPayment).exchangeBitcoin(10));
        } else {
            System.out.println("myPayment object can not be downcasted to " +
                    "Bitcoin");
        }


    }

    public static void payByAnything(Payment payment) {
        payment.pay();
    }
}
