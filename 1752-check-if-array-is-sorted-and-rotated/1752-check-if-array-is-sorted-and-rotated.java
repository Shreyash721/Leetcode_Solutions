class Solution {
    public boolean check(int[] nums) {
        int l=nums.length-1;
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                c++;
            }
        }
        if((c==1 && nums[0]>=nums[l]) || c==0) return true;
        return false;
    }
}