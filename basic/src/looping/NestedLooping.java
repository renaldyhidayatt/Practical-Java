package looping;

public class NestedLooping {
    public static void main(String[] args) {
        for(int i = 1;i < 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println("-------------------------------");
        }

        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        int i=1;
        while(i<=8){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            i++;
        }
    }
}
