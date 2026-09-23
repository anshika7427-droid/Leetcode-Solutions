class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count_w = 0;
        for(int i = 0 ; i < k ; i++){
            if(blocks.charAt(i) == 'W'){
                count_w++;
            }
        }
        int ans = count_w;
        for(int i = k ; i < blocks.length() ; i++){
            if(blocks.charAt(i - k) == 'W'){
                count_w--;
            }
            if(blocks.charAt(i) == 'W'){
                count_w++;
            }
            ans = Math.min(ans , count_w);
        }
        return ans;
    }
}