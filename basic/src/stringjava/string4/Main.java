package stringjava.string4;

public class Main {

    public static void main(String[] args) {
        String myState = "Colorado";
        System.out.println("Length:" + myState.length());

        
        System.out.println("char at index 0: "+myState.charAt(0));

        System.out.println("Substring starting from index 4:"+myState.substring(4));

        System.out.println("Occurrences of lora: "+myState.indexOf("lora"));
        System.out.println("Occurrences of zona: "+myState.indexOf("zona"));

        
        System.out.println(myState.equals("Colorado"));
        System.out.println(myState.equalsIgnoreCase("COLORADO"));
        System.out.println(myState.compareTo("Arizona"));
        
        String mySalary = String.valueOf(2000.155);
        System.out.println(mySalary.substring(4));







    }
}
