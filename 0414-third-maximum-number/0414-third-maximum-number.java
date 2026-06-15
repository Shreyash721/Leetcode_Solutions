class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        int l=nums.length;
        for(int i=l-2;i>=0;i--){
            if(nums[i]!=nums[i+1]) cnt++;
           
            if(cnt==2) return nums[i];
        }
        return nums[nums.length-1];
    }
}