package codes.longestvalidparenthesis;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public int longestValidParentheses(String s) {

        int max = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addFirst(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.addFirst(i);
            } else {
                stack.removeFirst();
                if (stack.isEmpty()) {
                    stack.addFirst(i);
                } else {
                    max = Math.max(max, i - stack.peekFirst());
                }
            }
        }
        return max;

    }
}
