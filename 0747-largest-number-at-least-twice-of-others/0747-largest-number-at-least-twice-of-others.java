class Solution 
{
    public int dominantIndex(int[] nums) 
    {
        int mx=nums[0];
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            if(mx<nums[i]) 
            {
                mx=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==idx) continue;
            else{
                if(mx<(2*nums[i])) return -1;
            }
        }
    return idx;
    }
}