class Solution {
    public int climbStairs(int n) {
       /* if(n==1) return 1;
        if(n==2) return 2;
        return climbStairs(n-1)+climbStairs(n-2);*/
        int[] dp = new int[n + 1];
        return solve(n, dp);
    }

    private int solve(int n, int[] dp) {
        if (n == 0 || n == 1) return 1;

        if (dp[n] != 0) return dp[n];

        return dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
    }
}