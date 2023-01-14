package codes.paranthesisisvalid;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public boolean isValid(String s) {
        boolean check = true;
        Deque<Character> stack = new ArrayDeque<>();
        if (s.length() < 1 || s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.addFirst(s.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else if (!(stack.pop() == getLeft(s.charAt(i)))) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private char getLeft(char c) {
        if (c == ')') {
            return '(';
        } else if (c == ']') {
            return '[';
        } else if (c == '}') {
            return '{';
        } else {
            return 'x';
        }
    }
}


