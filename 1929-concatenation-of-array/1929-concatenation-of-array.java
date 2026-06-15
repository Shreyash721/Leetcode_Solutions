class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr=new int[2*nums.length];
        int l=nums.length;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[l+i]=nums[i];
        }
        return arr;
    }
}