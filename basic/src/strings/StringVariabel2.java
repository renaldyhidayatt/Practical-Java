package strings;

public class StringVariabel2 {
    public static void kentang() {
        String myName = "William";
        System.out.println("myName= " + myName);
        String mySurname = "Smith";
        System.out.println("mySurname= " + mySurname);

        // Now Lets concatenate my name and surname and assign to another variable
        // myFullName. To concatenate we can use + operator.
        String myFullName = myName + mySurname;
        System.out.println("myFullName= " + myFullName);

        // As wee see there is a space necessary in between my name and my surname so We
        // will put directly a space char surrounded double quotes without using a
        // variable in between them.
        myFullName = myName + " " + mySurname;
        System.out.println("myFullName= " + myFullName);

        String myCode = myName + 1979;
        System.out.println("myCode= " + myCode);
        int myBirthDate = 1979;
        myCode = myName + myBirthDate;
        System.out.println("myCode= " + myCode);

        // To concatenate more numeric values we need at least one double
        // quote that surrounds empty
        String myExactBirthDate = "" + 1979 + "/" + 11 + "/" + 25;
        System.out.println("myExactBirthDate= " + myExactBirthDate);
    }
}
