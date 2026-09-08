class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        for(String w : words){
            boolean good = true;
            for(char ch : w.toCharArray()){
                if(!set.contains(ch)){
                    good = false;
                    break;
                }
            }
            if(good){
                res++;
            }
        }
        return res;
    }
}