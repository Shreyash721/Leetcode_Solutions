class Solution {
    public int maximumCount(int[] nums) {
        int pc=0;
        int nc=0;
       for(int x:nums){
        if(x<0) nc++;
        else if(x>0) pc++;
       }
       int max=pc>nc?pc:nc;

       return max;
    }
}