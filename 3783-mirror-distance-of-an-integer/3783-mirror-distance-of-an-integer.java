class Solution {
    public int mirrorDistance(int n) {
        int num=0;
        int orig=n;
        while(n>0){
            int r=n%10;
            num=num*10+r;
            n=n/10;
        }
        return Math.abs(num-orig);
    }
}