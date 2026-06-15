class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = 1;
        boolean f = true, g = true;

        while (j < nums.length) {
            if (nums[i] > nums[j]) {
                f = false; 
            }
            if (nums[i] < nums[j]) {
                g = false;   
            }
            i++;
            j++;
        }
        return f || g;
    }
}