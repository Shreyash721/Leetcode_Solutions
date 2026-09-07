class Solution {
    public int maxProfit(int[] nums) {
        int sum=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum=sum+(nums[i]-nums[i-1]);
            }
        }
        return sum;
    }
}