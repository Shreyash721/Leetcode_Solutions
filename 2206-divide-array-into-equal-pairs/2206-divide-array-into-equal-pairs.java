class Solution {
    public boolean divideArray(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) c++;
            }
            if(c%2!=0 ) return false;
        }
        return true;
    }
}