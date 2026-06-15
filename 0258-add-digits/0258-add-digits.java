class Solution {
    public int add(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    int s=0;
    public int addDigits(int num) {
        s=add(num);
        if(s<0) return s;
        else{
            while(s>9){
                s=add(s);
            }
        }
        return s;
    }
}