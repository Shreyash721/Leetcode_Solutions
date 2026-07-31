class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return nums.length-1;
        int i=1;
        if(nums.length==2){
            if(nums[i]>nums[i-1]) return i;
            if(nums[i-1]>nums[i]) return i-1;
        }
        while(i<=nums.length-2){
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                return i;
            }
            else if(nums[i-1]>nums[i] && (i-1==0)) return i-1;
            else{
                i=i+1;
            }
        }

        return i;
    }
}