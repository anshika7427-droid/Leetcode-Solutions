class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            HashSet<Character> charSet = new HashSet<>();
            for(int j = i ; j < s.length() ; j++){
                if(charSet.contains(s.charAt(j))){
                    break;
                }
                charSet.add(s.charAt(j));
            }
            count = Math.max(count , charSet.size());
        }
        return count;
    }
}