class Solution {

    private long combinations(int n, int r) {
        r = Math.min(r, n - r);
        long result = 1; 
        for(int i = 1; i <=r; i++){
            result = result * (n - r + i) / i;
        }
        return result;
    }

    public int climbStairs(int n) {
        int uniqueWays = 0;

        for (int twos = 0; twos <= n / 2; twos++) {
            int ones = n - (2 * twos);
            int totalMoves = ones + twos;
            uniqueWays+=combinations(totalMoves, twos);
        }

        return uniqueWays;
    }
}