class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int result = nums[0];
        int minProduct = nums[0];

        for(int i = 1; i < nums.length;i++){
            int newMin = minProduct*nums[i];
            int newMax = maxProduct*nums[i];

            maxProduct = Math.max(nums[i], Math.max(newMax, newMin));

            minProduct = Math.min(nums[i], Math.min(newMax, newMin));

            result = Math.max(maxProduct, result);
        }
        return result;
        
    }
}
