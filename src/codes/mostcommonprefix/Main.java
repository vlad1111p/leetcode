package codes.mostcommonprefix;

public class Main {
    public String longestCommonPrefix(String[] strs) {


        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = strs[0].length(); i > 0; i--) {

            String subString = strs[0].substring(0, i);
            boolean check = true;
            for (String s : strs) {
                if (s.length() < i) {
                    check = false;
                    break;
                }
                if (!s.substring(0, i).equals(subString)) {
                    check = false;
                }
            }

            if (check) {
                return subString;
            }
        }

        return "";
    }
}
