class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int n = operations.length;
        for(int i = 0 ; i < n ; i++){
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                int num = st.peek() * 2;
                st.push(num);
            }else if(operations[i].equals("+")){
                int first = st.pop();
                int second = st.pop();

                int sum = first + second;
                st.push(second);
                st.push(first);
                st.push(sum);
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0 ;
        for(int num : st){
            sum = sum + num;
        }
        return sum;
    }
}