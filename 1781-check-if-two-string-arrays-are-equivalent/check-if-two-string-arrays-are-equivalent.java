public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        for (String w : word1) {
            s1.append(w);
        }

        int i = 0;
        for (String w : word2) {
            for (char c : w.toCharArray()) {
                if (i == s1.length() || s1.charAt(i) != c) {
                    return false;
                }
                i++;
            }
        }
        return i == s1.length();
    }
}