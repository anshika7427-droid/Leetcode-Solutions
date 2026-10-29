// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int[] answers = new int[temperatures.length];
//         for(int i = 0 ; i < temperatures.length ; i++){
//             int j = i + 1;
//             while(j < temperatures.length){
//                 if(temperatures[j] > temperatures[i]){
//                     answers[i] = j - 1;
//                     break;
//                 }
//             }
//         }
//         return answers;
//     }
// }

class Solution{
    public int[] dailyTemperatures(int[] temperatures){
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] answers = new int[n];

        for(int i = 0 ; i < n ; i++){

            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prev = st.pop();
                answers[prev] = i - prev;
            }

            st.push(i);
        }

        return answers;
    }
}