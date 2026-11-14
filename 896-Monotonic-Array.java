class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean dec = true;
        boolean inc = true;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] > nums[i+1]) {inc = false; break;} 
        }
        for (int j = nums.length - 1; j > 0; j--){
            if (nums[j] > nums[j-1]) {dec = false; break;} 
        }        
        return inc || dec;
    }
}