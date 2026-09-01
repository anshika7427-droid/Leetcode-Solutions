class Solution {
    public int[] finalPrices(int[] prices) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < prices.length ; i++){
            int originalPrice = prices[i];
            int finalPrice = 0;
            int discount = 0;
            for(int j = i+1 ; j < prices.length ; j++){
                if(prices[j] <= prices[i]){
                    discount = prices[j];
                    finalPrice = originalPrice - discount;
                    result.add(finalPrice);
                    break;
                }
            }
            if(discount == 0){
                result.add(originalPrice);
            }
        }
        int[] arr = result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
        return arr;
    }
}