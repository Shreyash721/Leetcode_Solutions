class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int c=a+b;
            int sum=a+b+c;
            if(sum==n) return true;
            if(sum>n) return false;
            a=b;
            b=c;
        }

        return false;
    }
}