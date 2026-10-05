class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> uniqueTriplets = new ArrayList<>();
       Arrays.sort(nums);
       
       for(int i = 0; i < nums.length; i++){
        if(i > 0 && nums[i] == nums[i-1]){
            continue;
        }
        int target = -nums[i];
        int leftIdx = i + 1;
        int rightIdx = nums.length - 1;

        while(leftIdx < rightIdx){
           int sum = nums[leftIdx] + nums[rightIdx];
           if(sum == target){
            uniqueTriplets.add(new ArrayList<>(Arrays.asList(-target, nums[leftIdx], nums[rightIdx])));
            leftIdx++;
            rightIdx--;
            while(leftIdx < rightIdx && nums[leftIdx] == nums[leftIdx - 1]){
                leftIdx++;
            }
            while(leftIdx < rightIdx && nums[rightIdx] == nums[rightIdx + 1]){
                rightIdx--;
            }
           }else if (sum < target){
            leftIdx++; //need bigger sum
           }else{
            rightIdx--; //need smaller sum
           }
        }

       }
       return uniqueTriplets;
    }
}
