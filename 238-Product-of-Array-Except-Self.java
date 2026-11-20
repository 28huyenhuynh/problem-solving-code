class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
        pref[i] = pref[i - 1] * nums[i];
        }
        int[] suff = new int[nums.length];
        suff[0] = nums[nums.length-1];
        int j = nums.length - 2;
        for (int i = 1; i < nums.length; i++){
            suff[i] = suff[i-1] * nums[j];
            j--;
        }
        int[] ans = new int[nums.length];
        ans[0] = suff[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++){
        ans[i] = pref[i - 1] * suff[nums.length - 2 - i];
        }
        ans[nums.length - 1] = pref[nums.length -2];
        return ans;
    }
}