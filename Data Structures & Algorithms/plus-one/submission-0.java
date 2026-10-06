class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
       for(int i = digits.length - 1; i >= 0; i--){
        if(digits[i] == 9 && carry == 1){
            digits[i] = 0; 
            carry = 1;
        }else{
            digits[i] = digits[i] + carry;
            carry = 0;
        }
       }
       int[] result = new int[digits.length + 1];
       if(carry == 1){
        result[0] = carry;
        for(int i = 1; i < digits.length; i++){
            result[i] = digits[i];
        }
        return result;
       }
       return digits; 
    }
}
