package Easy.reverseInteger;

public class ReverseInteger {
    public static int reverse(int x) {
        if (x > (1 << 31) - 1 || x < -(1 << 31)) {
            return 0;
        }
        int res = 0;
        while (x != 0) {
            int last = x % 10;
            res = (res * 10) + last;
            x = x / 10;
        }

        if (res > (1 << 31) - 1 || res < -(1 << 31)) {
            return 0;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
