class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i] , mp.get(nums[i])+1);
            }else{
                mp.put(nums[i] , 1);
            }
        }
        int count = 0 ;
        for(int cnt : mp.values()){
            count += (cnt * (cnt - 1))/2;
        }
        return count;
    }
}