/*class Solution {
    public int trailingZeroes(int n) {
        int f=0;
        int e=1;
        f=factorial(n);
        System.out.print(f);
        int c=0;
        if(f<=9) return 0;
        while(n>0){
            e=e*5;
            n=n/e;
            c=c+n;
        }
        
        return c;
    }
    public int factorial(int n){
        if(n==0 || n==1) return 1;
        else{
            return n*factorial(n-1);
        }
    }
}*/

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        long e = 5;

        while (n / e > 0) {
            count += n / e;
            e *= 5;
        }

        return count;
    }
}