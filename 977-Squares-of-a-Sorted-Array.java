class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        // toàn số âm
        if (nums[nums.length - 1] <= 0) {
            int i = 0;
            for (int j = nums.length - 1; j >= 0; j--){
                ans[i] = nums[j] * nums[j];
                i++;
            }
            return ans;
        } 
        // toàn số dương
        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++){
                ans[i] = nums[i] * nums[i];
            }
            return ans;
        }
        // âm dương (2 pointers)
        int r = 1; int l = 1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= 0) {r = i; break;} 
        }
        l = r - 1;
        int i = 0;
        while (l >= 0 && r < nums.length){
            if (Math.abs(nums[l]) < nums[r]) {
                ans[i] = nums[l] * nums[l];
                i++;
                l--;
            } else if (Math.abs(nums[l]) >= nums[r]) {
                ans[i] = nums[r] * nums[r];
                i++;
                r++;
            }
        }
        while (l >= 0){
            ans[i] = nums[l] * nums[l];
            l--;
            i++;
        }
        while (r < nums.length){
            ans[i] = nums[r] * nums[r];
            r++;
            i++;
        }
        return ans;
    }
}