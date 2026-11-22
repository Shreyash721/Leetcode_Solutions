class Solution {
    public long minCost(int[] nums) {
        int n=nums.length;
        long inf=Long.MAX_VALUE/4;
        long dp1=inf;
        long dp=0;
        long dp2=inf;
        for(int i=0;i<n;i++){
            long x=nums[i];
            long ndp=inf;
            long ndp1=inf;
            long ndp2=inf;
            ndp1=Math.min(ndp1,dp+x);
            ndp1=Math.min(ndp1,dp1);
            ndp2=Math.min(ndp2,dp2);

            ndp2=Math.min(ndp2,dp1+x);
            ndp1=Math.min(ndp1,dp2+x);

            ndp=Math.min(ndp,dp1+x);
            dp=ndp;
            dp1=ndp1;
            dp2=ndp2;
        }
        return dp;
    }
}