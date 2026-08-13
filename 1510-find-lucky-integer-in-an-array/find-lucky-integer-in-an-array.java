class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        int num = -1;

        for(int i = 0 ; i < arr.length ; i++){
            int n = arr[i];
            if(mp.get(n) == n && num < n){
                num = n;
            }
        }
        return num;
    }
}