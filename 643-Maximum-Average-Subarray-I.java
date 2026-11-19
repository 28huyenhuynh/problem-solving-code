class Solution {
    public double findMaxAverage(int[] nums, int k) {
int[] pref = new int[nums.length];
pref[0] = nums[0];
for (int i = 1; i < nums.length; i++){
    pref[i] = pref[i-1] + nums[i];
}
double ans;
int max = pref[k-1];
int sum;
int L = 1;
int R = L + k - 1;
while (R < nums.length){
sum = pref[R] - pref[L-1];
max = Math.max(max, sum);
L++;
R++;
}
ans = (double) max / (double) k;
return ans;
    }
}