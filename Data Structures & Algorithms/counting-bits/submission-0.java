class Solution {
    public int[] countBits(int n) {
        int[] output = new int[n + 1];
        for(int i = 0; i <= n; i++){
            String binary = Integer.toBinaryString(i);
            char[] myBinary = binary.toCharArray();

            int counter = 0;
            for(int j = 0; j < myBinary.length; j++){
                if(myBinary[j] - '0' == 1){
                    counter++;
                }
            }
            output[i] = counter;
        }
        return output;
        
    }
}
