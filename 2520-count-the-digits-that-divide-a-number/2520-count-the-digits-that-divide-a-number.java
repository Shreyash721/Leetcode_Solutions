class Solution {
    public int countDigits(int num) {
        int c=0;
        int nums=num;
        while(nums>0){
            int r=nums%10;
            if(r!=0 && num%r==0) c++;
            nums=nums/10;
        }
        return c;
    }
}