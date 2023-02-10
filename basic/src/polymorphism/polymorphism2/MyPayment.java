package polymorphism.polymorphism2;

public class MyPayment {
    public static void main(String[] args) {
        Payment payment = new Payment();
        CreditCard creditCard = new CreditCard();
        MasterCard masterCard = new MasterCard();
        VisaCard visaCard = new VisaCard();
        Cheque cheque = new Cheque();
        Cash cash = new Cash();


        // CreditCard IS A Payment
        System.out.println("CreditCard IS A Payment: " + (creditCard instanceof Payment));

        // VisaCard IS A Credit Card
        System.out.println("VisaCard IS A Credit Card: " + (visaCard instanceof CreditCard));

        // MasterCard IS A Credit Card
        System.out.println("MasterCard IS A Credit Card: " + (masterCard instanceof CreditCard));

        // MasterCard IS A Payment
        System.out.println("MasterCard IS A Payment: " + (masterCard instanceof Payment));

        // VisaCard IS A Payment
        System.out.println("VisaCard IS A Payment: " + (visaCard instanceof Payment));

        // Cheque IS A Payment
        System.out.println("Cheque IS A Payment: " + (cheque instanceof Payment));

        // Cash IS A Payment
        System.out.println("Cash IS A Payment: " + (cash instanceof Payment));

        System.out.println("Payment IS A CreditCard: " + (payment instanceof CreditCard));

    }
}
