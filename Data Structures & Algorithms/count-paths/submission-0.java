class Solution {
    private int dfs(int m, int n, int row, int col, int[][] memo){
        if(row >= m || col >= n){
            return 0;
        }
        if(row == m - 1 && col == n - 1){
            return 1;
        }
        if(memo[row][col] != 0){
            return memo[row][col];
        }
        memo[row][col] = dfs(m,n,row+1, col, memo) + dfs(m,n,row, col+1, memo);

        return memo[row][col];
    }
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        return dfs(m,n,0,0,memo);
    }
}
