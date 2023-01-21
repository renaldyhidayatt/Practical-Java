package Easy.validparentheses;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);

            if (t == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char current = stack.pop();
                if (current != '(') {
                    return false;
                }
            } else if (t == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char current = stack.pop();
                if (current != '{') {
                    return false;
                }
            } else if (t == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char current = stack.pop();
                if (current != '[') {
                    return false;
                }
            } else {
                stack.push(t);
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
