class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr=new int[2];
        int i=0;
        int j=nums.length-1;
        int idxf=-1;
        int idxl=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                idxf=mid;
                j=mid-1;
            }
            else if(nums[mid]<target) i=mid+1;
            else if(nums[mid]>target) j=mid-1;
        }
        i=0;
        j=nums.length-1;
         while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                idxl=mid;
                i=mid+1;
            }
            else if(nums[mid]<target) i=mid+1;
            else if(nums[mid]>target) j=mid-1;
        }
    arr[0]=idxf;
    arr[1]=idxl;

    return arr;
    }
}