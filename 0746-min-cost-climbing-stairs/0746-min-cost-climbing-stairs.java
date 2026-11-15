class Solution {
    private static int solve(int i,int[] arr,int[] dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int f=solve(i+1,arr,dp);
        int l=solve(i+2,arr,dp);
        return dp[i]=arr[i]+Math.min(f,l); 
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int one=solve(0,cost,dp);
        int two=solve(1,cost,dp);
        return Math.min(one,two);
    }
}