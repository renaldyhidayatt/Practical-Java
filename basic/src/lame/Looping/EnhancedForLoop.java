package lame.Looping;

public class EnhancedForLoop {
    public static void kentang() {
        int[] number = { 5, 10, 15, 20, 25 };
        for (int x : number) {
            System.out.println(x + ",");
        }

        System.out.print("\n");

        String[] names = { "Kentang", "Apple", "Jambu" };
        for (String name : names) {
            System.out.println(name + ",");
        }
    }
}
