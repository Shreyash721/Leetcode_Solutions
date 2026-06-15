class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int d;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                d=Math.abs(i-start);
                min=Math.min(min,d);
            }
        }
        return min;
    }
}