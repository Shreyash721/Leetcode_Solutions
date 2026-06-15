class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int mx=0;
        for(int x:nums){
            if(x==1){
                c++;
                mx=Math.max(mx,c);
            }
            else{
                c=0;
            }
        }
    return mx;
    }
}