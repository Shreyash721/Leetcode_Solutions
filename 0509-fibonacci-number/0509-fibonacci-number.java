class Solution {
    private static int fibo(int n,int[] dp){
    //     if(n<=1) return n;
    //     if(dp[n]!=0) return dp[n];
    //     int ans=fibo(n-2,dp)+fibo(n-1,dp);
    //     dp[n]=ans;
    //     return ans;
        if(n<=1) return n;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
    public int fib(int n) {
        // int[] dp=new int[n+1];
        // return fibo(n,dp);

        // tabulation:
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fibo(n,dp);


    }
}