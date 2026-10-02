class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> numbers = new HashSet<>();
       for(int num: nums){
        numbers.add(num);
       }
       int length = 0;
       for(int num : numbers){
        if(!numbers.contains(num - 1)){
            int currentNum = num;
            int currentLength = 1; 

            while(numbers.contains(currentNum + 1)){
                currentNum = currentNum + 1;
                currentLength++;
            }
            length = Math.max(currentLength, length);
        }
       }
       return length;
    }
}
