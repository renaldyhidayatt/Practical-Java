package looping;

public class ForLooping {
    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i++){
            System.out.println("John " + i);
        }

        int start = 3;
        int end = 8;

        for(int i = start; i <= end; i++){
            int square = i * i;
            int cube = i * i *i;

            System.out.println(i + "\t" + square + "\t" + cube);
        }

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                int square = i * i;
                int cube = i * i * i;
                System.out.println(i + "\t" + square + "\t" + cube);
            }
        }

        for(int i =10; i >= 1; i--){
            System.out.println(i);
        }
    }
}
