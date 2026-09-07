class Solution {
    public int minimumRecolors(String blocks, int k) {
        int low = 0;
        int count = 0;
        int res = Integer.MAX_VALUE;

        for (int high = 0; high < blocks.length(); high++) {

            // Add new element
            if (blocks.charAt(high) == 'W') {
                count++;
            }

            // Window size becomes k
            if (high - low + 1 == k) {
                res = Math.min(res, count);

                // Remove element going out
                if (blocks.charAt(low) == 'W') {
                    count--;
                }

                low++;
            }
        }

        return res;
    }
}