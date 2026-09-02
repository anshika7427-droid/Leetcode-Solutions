class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int doubleVal = 0 , missingVal = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                 mp.put(grid[i][j] , mp.getOrDefault(grid[i][j] , 0) + 1);
            }
        }
        for(int i = 1 ; i <= n * n ; i++){
            if(!mp.containsKey(i)){
                missingVal = i;
            }else if(mp.get(i) == 2){
                doubleVal = i;
            }
        }
        return new int[]{doubleVal , missingVal};
    }
}