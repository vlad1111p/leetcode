package codes.longestpalindrome;

import java.util.Arrays;

public class Main {
    public int longestPalindrome(String s) {
        int[] array = new int[256];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)]++;
        }
        //remove this part
        String s1 = Arrays.stream(array).collect(
                StringBuilder::new,
                (sb, i) -> sb.append(i),
                StringBuilder::append
        ).toString();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count += array[i];
            } else {
                count += array[i] - 1;
            }
        }
        if (count < s.length()) {
            count++;
        }
        return count;
    }
}
