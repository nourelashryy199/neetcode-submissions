class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] letters = s.toCharArray();

        int right = 0; 
        int left = letters.length - 1;

        while (right < left){
            if(letters[right] != letters[left]){
                return false;

            }
            right++;
            left--;
        }
        return true; 
    }
}

