class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int min=nums[0];
        while(i<nums.length){
          if(min>nums[i]){
            min=nums[i];
          }
          i++;
        }
       return min; 
    }
}