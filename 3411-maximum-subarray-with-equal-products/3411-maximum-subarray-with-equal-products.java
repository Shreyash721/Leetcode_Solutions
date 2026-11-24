class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            long p=1,g=0,l=1;
            for(int j=i;j<n;j++){
                p*=nums[j];
                g=gcd(g,nums[j]);
                l=lcm(l,nums[j]);
                if(p==g*l) ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
    public long gcd(long a,long b){
        while(b!=0){
            long t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public long lcm(long a,long b){
        return (a/gcd(a,b))*b;
    }
}