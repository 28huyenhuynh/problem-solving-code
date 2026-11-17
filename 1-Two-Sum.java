class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (complement.containsKey(target - nums[i])) {
                int a = complement.get(target - nums[i]);
                int b = i;
             return new int[]{a, b};
            }
            complement.put(nums[i], i);
        }
        return new int[]{};
    }
}