package polymorphism.polymorphism7;

public class TestObjectClass {

    public static void main(String[] args) {
        Object payment = new Payment();
        Object bitcoin = new Bitcoin();
        Object cash = new Cash();
        
        ((Payment) payment).pay();
        ((Bitcoin) bitcoin).pay();
        ((Cash) cash).pay();

        Object[] objects = new Object[3];
        objects[0] = 10;
        objects[1] = "I am a string literal";
        objects[2] = new CreditCard();
        
        for (Object object : objects) {
            if (object instanceof CreditCard) {
                CreditCard creditCard = (CreditCard) object;
                creditCard.pay();
            }
        }

        
        System.out.println(bitcoin);

        System.out.println(bitcoin.toString());
        


        
        ((Bitcoin) bitcoin).oneBitcoin = 2.75f;
        System.out.println(bitcoin);

        System.out.println(bitcoin.hashCode());

        Cheque xCheque = new Cheque(100);
        Cheque yCheque = new Cheque(100);

        System.out.println(xCheque.equals(yCheque));

        

    }
}
