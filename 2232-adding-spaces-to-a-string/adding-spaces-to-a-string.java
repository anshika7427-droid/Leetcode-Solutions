class Solution {
    public String addSpaces(String s, int[] spaces) {
        int idx = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(idx < spaces.length){
                int space = spaces[idx];
                
                String str = s.substring(i,space);

                ans.append(str);
                ans.append(" ");

                i = space - 1;
                idx++;
            }else{
                ans.append(s.substring(i));
                break;
            }
        }
        return ans.toString();
    }
}