class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ele=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            else{
                i++;
            }
        }

    return ele;
    }
}