package abstractjava.abstract7;

public interface OnlinePayment extends VirtualPOS, CardlessPayment {

   default public void testSuperInterfaceMembers(){
        VirtualPOS.isValidCreditCardNumber("111111111111");
       System.out.println(VirtualPOS.commissionRate);
       VirtualPOS.super.payInInstallment("11111111",12,2);
    }


}
