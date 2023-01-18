package lame.Looping;

public class ContinueLoop {
    public static void kentang() {
        int[] numbers = { 5, 10, 15, 20, 25, 30 };
        for (int x : numbers) {
            if (x == 15) {
                continue;
            }
            System.out.println(x);
        }
    }
}
