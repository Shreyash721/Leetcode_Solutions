class Solution {
    public int[] plusOne(int[] nums) {
        
        for(int i = nums.length - 1; i >= 0; i--){
            
            if(nums[i] < 9){
                nums[i]++;
                return nums;
            }
            
            nums[i] = 0;
        }
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        return result;
    }
}

