class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                for (int j = 1; j <= k; j++) {
                    if (i + j < nums.length && nums[i + j] == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
