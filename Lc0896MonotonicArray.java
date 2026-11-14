public class Lc0896MonotonicArray {

    public boolean isMonotonic(int[] nums) {
        boolean dec = true;
        boolean inc = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) { inc = false; break; }
        }
        for (int j = nums.length - 1; j > 0; j--) {
            if (nums[j] > nums[j - 1]) { dec = false; break; }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        Lc0896MonotonicArray sol = new Lc0896MonotonicArray();
        System.out.println(sol.isMonotonic(new int[]{1, 2, 2, 3})); // expect true
        System.out.println(sol.isMonotonic(new int[]{6, 5, 4, 4})); // expect true
        System.out.println(sol.isMonotonic(new int[]{1, 3, 2}));    // expect false
    }
}