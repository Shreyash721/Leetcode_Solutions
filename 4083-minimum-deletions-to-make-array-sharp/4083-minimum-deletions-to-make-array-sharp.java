class Solution {
    public int minDeletions(int[] nums) {
        int c=0;
        int i=1;
        while(i<nums.length){
            if((nums[i-1]^nums[i])==0){
                c++;
            }
            i++;
        }

        return c;
    }
}