class Solution {

    private boolean dfs(String s, List<String> wordDict, int index, Boolean[] memo) {

        if (index == s.length()) {
            return true;
        }
        if (memo[index] != null) {
            return memo[index];
        }
        for (String word : wordDict) {
            if (s.startsWith(word, index)) {
                if (dfs(s, wordDict, index + word.length(), memo)) {
                    memo[index] = true;
                    return true;
                }
            }
        }

        memo[index] = false;
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        Boolean[] memo = new Boolean[s.length()];

        return dfs(s, wordDict, 0, memo);
    }
}