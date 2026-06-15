class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int k=0;
        int [] arr=new int[2];
        while(i<nums.length-1 && k<2){
            if(nums[i]==nums[i+1]){
                arr[k++]=nums[i];
                i=i+2;
            }
            else i++;
        }

        return arr;

    }
}