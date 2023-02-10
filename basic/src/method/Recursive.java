package method;

public class Recursive {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int number) {
        System.out.println("factorial("+number+") is called");
        if(number != 0){
            int fact = number * factorial(number-1);
            System.out.println("return "+number+"*factorial("+(number-1)+")="+fact);
            return fact;
        }else{
            System.out.println("return factorial(0)= "+1);
            return 1;
        }
    }
}
