class Solution {
    public int[] finalPrices(int[] prices) {
        // ArrayList<Integer> result = new ArrayList<>();
        // for(int i = 0 ; i < prices.length ; i++){
        //     int originalPrice = prices[i];
        //     int finalPrice = 0;
        //     int discount = 0;
        //     for(int j = i+1 ; j < prices.length ; j++){
        //         if(prices[j] <= prices[i]){
        //             discount = prices[j];
        //             finalPrice = originalPrice - discount;
        //             result.add(finalPrice);
        //             break;
        //         }
        //     }
        //     if(discount == 0){
        //         result.add(originalPrice);
        //     }
        // }
        // int[] arr = result.stream()
        //              .mapToInt(Integer::intValue)
        //              .toArray();
        // return arr;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[prices.length];
        int n = prices.length;

        for(int i = n-1 ; i >= 0 ; i--){
            while(st.size() > 0 && st.peek() > prices[i]){
                st.pop();
            }
            if(st.size() == 0) 
                res[i] = prices[i];
            else
                res[i] = prices[i] - st.peek();
            st.push(prices[i]);
        }
        return res;
    }
}