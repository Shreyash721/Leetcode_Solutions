class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int ele=nums[i];
        while(k>0){
            ele=nums[i];
            i--;
            k--;
        }
        return ele;
    }
}