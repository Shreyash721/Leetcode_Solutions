class Solution {
    public int countCommas(int n) {
        int c=0;
        for(int i=1000;i<=n; i*=1000) {
            c+=n-i+1;
            if(i>n/1000) {
                break;
            }
        }
        return c;
    }
}