class Solution {
    public int tribonacci(int n) {
        int sum=0;
        int i=3;
        int a=0,b=1,c=1;
        if(n==0) return a;
        if(n==1) return b;
        if(n==2) return c;
        while(i<=n){
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            i++;
        }

        return sum;
    }
}