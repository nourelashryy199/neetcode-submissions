class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] lettersS = s.toCharArray();
        char[] lettersT = t.toCharArray();

        Arrays.sort(lettersS);
        Arrays.sort(lettersT);

        return Arrays.equals(lettersS, lettersT);
    }
}
