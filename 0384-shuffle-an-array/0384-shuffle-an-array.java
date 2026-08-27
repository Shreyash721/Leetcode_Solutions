class Solution {

    private int[] original;

    public Solution(int[] nums) {
        original = nums.clone();
    }
    
    public int[] reset() {
        return original.clone();
    }
    
    public int[] shuffle() {
        int[] shuffled = original.clone();

        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }

        return shuffled;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */