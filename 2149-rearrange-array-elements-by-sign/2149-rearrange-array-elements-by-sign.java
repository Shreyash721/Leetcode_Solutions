class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] arr1=new int[nums.length/2];
        int [] arr2=new int[nums.length/2];
        int [] arr3=new int[nums.length];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr1[j]=nums[i];
                if(j<arr1.length-1)j++;
            }
            else{
                arr2[k]=nums[i];
                if(k<arr2.length-1) k++;
            }
        }
        int idx=0;
        j=0;k=0;
        for(int i=0;i<nums.length;i++){
            if(idx%2==0){
                arr3[i]=arr1[j];
                if(j<arr1.length-1) j++;
            }
            else{
                arr3[i]=arr2[k];
                if(k<arr2.length-1) k++;
            }

            idx++;
        }


        return arr3;

    }
}