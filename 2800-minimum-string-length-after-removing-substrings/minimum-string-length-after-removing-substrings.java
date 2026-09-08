class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(st.size() > 0){
                String str = "" + st.peek() + ch;
                if(str.equals("AB") || str.equals("CD")){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                st.push(ch);
            }
        }
        return st.size();
    }
}