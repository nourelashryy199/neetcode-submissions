class Solution {

    private int dfs(String text1, String text2, int idx1, int idx2, int[][] memo) {

        if (idx1 == text1.length() || idx2 == text2.length()) {
            return 0;
        }

        if (memo[idx1][idx2] != -1) {
            return memo[idx1][idx2];
        }

        if (text1.charAt(idx1) == text2.charAt(idx2)) {
            memo[idx1][idx2] =
                1 + dfs(text1, text2, idx1 + 1, idx2 + 1, memo);
        }

        else {
            int skipText1 =
                dfs(text1, text2, idx1 + 1, idx2, memo);

            int skipText2 =
                dfs(text1, text2, idx1, idx2 + 1, memo);

            memo[idx1][idx2] = Math.max(skipText1, skipText2);
        }

        return memo[idx1][idx2];
    }

    public int longestCommonSubsequence(String text1, String text2) {

        int[][] memo = new int[text1.length()][text2.length()];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return dfs(text1, text2, 0, 0, memo);
    }
}