package LeetcodeQuestion;

public class Question9_ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuffer res = new StringBuffer();
        s = s.trim();
        int i = s.length() - 1, j = s.length();
        while (i > 0) {
            if (s.charAt(i) == ' ') {
                res.append(s.substring(i + 1, j));
                res.append(' ');
                while (s.charAt(i) == ' ') i--;
                j = i + 1;
            }
            i--;
        }
        return res.append(s.substring(0, j)).toString();
    }
}
