class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int max = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            if (mp.get(nums[i]) > max) {
                ans = nums[i];
                max = mp.get(nums[i]);
            }
        }
        return ans;
    }
}