class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums1.length];
        int n = nums2.length;
        for(int i = n - 1 ; i >= 0 ; i--){
            while(st.size() > 0 && st.peek() < nums2[i]){
                st.pop();
            }
            if(st.size() == 0)
                mp.put(nums2[i] , -1);
            else
                mp.put(nums2[i] , st.peek());
            st.push(nums2[i]);
        }
        for(int j = 0 ; j < nums1.length ; j++){
            res[j] = mp.get(nums1[j]);
        }
        return res;
    }
}