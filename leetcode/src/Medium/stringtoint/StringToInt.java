package Medium.stringtoint;

public class StringToInt {
    public static int myAtoi(String str) {
        int i = 0, n = str.length();

        while (i < n && Character.isSpaceChar(str.charAt(i))) {
            i++;
        }

        int sign = 1;

        if (i < n && str.charAt(i) == '+') {
            i++;
        } else if (i < n && str.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        int num = 0;
        int maxDiv10 = Integer.MAX_VALUE / 10;

        while (i < n && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            if (num > maxDiv10 || num == maxDiv10 && digit >= 8) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            }

            num = num * 10 + digit;
            i++;
        }

        return sign * num;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }
}
