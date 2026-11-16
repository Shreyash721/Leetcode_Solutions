class Solution {
    private static int solve(int i,int end,int[] arr,int[] dp){
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick=arr[i]+solve(i+2,end,arr,dp);
        int skip=solve(i+1,end,arr,dp);
        return dp[i]=Math.max(pick,skip);
    }    
    public int rob(int[] nums) {
        int n=nums.length;
        int [] dp1=new int[n+1];
        int [] dp2=new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        if(n==1) return nums[0];
        int f=solve(0,n-2,nums,dp1);
        int l=solve(1,n-1,nums,dp2);
        return Math.max(f,l);
    }
}