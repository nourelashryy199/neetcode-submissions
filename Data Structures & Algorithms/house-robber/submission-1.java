class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] best = new int[nums.length];
        best[0] = nums[0];
        best[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++){
            best[i] = Math.max(best[i - 1], best[i-2] + nums[i]);
        }
        return best[nums.length - 1];
    }
}
