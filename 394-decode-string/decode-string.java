public class Solution {
    private int i = 0;

    public String decodeString(String s) {
        return helper(s);
    }

    private String helper(String s) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                k = k * 10 + ( ch - '0');
            }else if(ch == '['){
                i++;
                String substr = helper(s);
                while(k-- > 0) sb.append(substr);
                k = 0;
            }else if(ch == ']'){
                return sb.toString();
            }else{
                sb.append(ch);
            }
            i++;
        }
        return sb.toString();
    }
}