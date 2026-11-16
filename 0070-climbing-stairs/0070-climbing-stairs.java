class Solution {
    private static int solve(int n,int[] dp){
        if(n<0) return 0;
        if(n==1 || n==2) return n;
        if(dp[n]!=-1) return dp[n];
        int f=solve(n-1,dp);
        int l=solve(n-2,dp);
        return dp[n]=f+l;
    }
    public int climbStairs(int n) {
      int [] dp=new int[n+1];
      Arrays.fill(dp,-1);
      return solve(n,dp);
    }
}