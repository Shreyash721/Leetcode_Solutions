class Solution {
    private static int solve(int i,int[] arr,int[] dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick=arr[i]+solve(i+2,arr,dp);
        int skip=solve(i+1,arr,dp);
        int ans=Math.max(pick,skip);
        dp[i]=ans;
        return ans;
    }
    public int rob(int[] arr) {
        int[] dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        return solve(0,arr,dp);
    }
}