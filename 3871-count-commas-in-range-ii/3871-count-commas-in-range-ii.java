class Solution {
    public long countCommas(long n) {

        long ans=0;
        if(n<1000) return 0;
        if(n==1000) return 1;
        for(long i=1000;i<=n;i*=1000){

            ans=ans+n-i+1;

        }

        return ans;
    }
}