// For each element of nums2, scan right for the first bigger one; store in a map; look up nums1
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    mp.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = mp.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}