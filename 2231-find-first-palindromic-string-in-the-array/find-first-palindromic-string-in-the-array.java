class Solution {
    public boolean isPalindrome(String s){
        int i = 0 ; 
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0 ; i < words.length ; i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
}