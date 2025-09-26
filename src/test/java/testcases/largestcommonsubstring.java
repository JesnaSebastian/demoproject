package testcases;

public class largestcommonsubstring {
    public static String findlargestsubstring(String s1, String s2) {

        String largest = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String sub = s1.substring(i, j);
                if (s2.contains(sub) && sub.length() > largest.length()) {
                    largest = sub;
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String s1 = "abcgtf";
        String s2 = "defabc";
        String result = findlargestsubstring(s1, s2);
        System.out.println("largest common substirng is: " + result);
    }

}
