class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int [] arr= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=-1;

            for(int j=1;j<nums.length;j++){

                int num=(i+j)%nums.length;

                if(nums[num]>nums[i]){
                    arr[i]= nums[num];
                    break;
                }
            }
        }

        return arr;
       
    }
}