package looping;

public class InfiniteLoop {
    public static void main(String[] args) {
       
        for (; ; )
            System.out.println("Hello world");

        for (; true; )
            System.out.println("Hello world");

        
        for (int i = 0; 2 < 3; i++)
            System.out.println(i);


        
        while (true)
            System.out.println("Hello world");


        do
            System.out.println("Hello world");
        while (2 < 3);

    }
}
