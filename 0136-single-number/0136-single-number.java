class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
       if(nums.length>2){
         if(nums[0]!=nums[1]) return nums[0];
         if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
       }
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i=i+2; 
        }
        return nums[nums.length - 1];
    }
}