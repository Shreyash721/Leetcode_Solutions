class Solution {
    public int maxArea(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int max=0;
        while(l<r){
            int area=Math.min(nums[l],nums[r]) * (r-l);
            
            if(nums[l]<nums[r]) l++;
            else r--;

            max=Math.max(max,area);
        }

        return max;
    }
}