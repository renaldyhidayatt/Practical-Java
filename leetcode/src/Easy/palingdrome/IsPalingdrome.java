package Easy.palingdrome;

public class IsPalingdrome {
    public static boolean isPalingdrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalingdrome(121));
    }
}
