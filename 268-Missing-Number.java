class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
      int suma = n*(n+1)/2;
      int sumb = 0;
      for (int x : nums){
        sumb += x;
      }  
      return suma - sumb;
    }
}