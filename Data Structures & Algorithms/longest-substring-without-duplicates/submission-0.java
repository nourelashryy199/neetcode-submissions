class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lengthMax = 0;
        Set<Character> seen = new HashSet<>();
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            while(seen.contains(s.charAt(r))){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            int length = r - l + 1;
            lengthMax = Math.max(lengthMax, length);
        }
        return lengthMax; 
    }
}
