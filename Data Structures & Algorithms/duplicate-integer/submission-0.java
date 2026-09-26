class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }
}