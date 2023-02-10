package polymorphism.polymorphism4;

public class TestPolymorphicSubtypes {
    public static void main(String[] args) {
        // we will declare an array of Payment that is the top most super
        // class in the hierarchy  and set its length to 7 since we have 7 types

        Payment[] myPayments = new Payment[7];
        // now we can put objects of each type as elements into the array
        // since the myPayments array has a polymorphic type
        myPayments[0] = new Payment();
        myPayments[1] = new CreditCard();
        myPayments[2] = new MasterCard();
        myPayments[3] = new VisaCard();
        myPayments[4] = new Cash();
        myPayments[5] = new Cheque();
        myPayments[6] = new Bitcoin();

        // now we can call pay() method for each object
        // With late binding mechanism pay() method of each elemnt is invoked
        for (Payment payment : myPayments) {
            payment.pay();
        }

        //we  will now call payByCreditCard() method by passing only
        //CreditCard and sub-types
        payByCreditCard(new CreditCard());
        payByCreditCard(new MasterCard());
        payByCreditCard(new VisaCard());

        //we can pass only types of CreditCard as an argument to this method
        // otherwise we get compilation error
        //payByCreditCard(new Cash());
    }

    //to see how polymorphic subtypes are used with methods
    //we will add payByCreditCard method that accepts only CreditCard and
    // sub-types as argument and in the method body we will add a method
    // calling statement for pay() method
    public static void payByCreditCard(CreditCard creditCard) {
        creditCard.pay();
    }
}
