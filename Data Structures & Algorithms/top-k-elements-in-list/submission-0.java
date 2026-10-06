class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int num : freq.keySet()){
            int frequency = freq.get(num);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(num);

        }
        int[] result = new int[k];
        int resultIndex = 0;

        for(int i = buckets.length - 1; i > 0;i--){
            if(buckets[i] != null){
                for(int num: buckets[i]){
                    result[resultIndex] = num;
                    resultIndex++;

                    if(resultIndex == k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
