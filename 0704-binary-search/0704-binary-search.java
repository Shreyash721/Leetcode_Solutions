class Solution {
    /* RECURSION METHOD */  

    public int binarysearch(int[] nums,int tar,int low,int high){
        int mid=low+(high-low)/2;
        if(low>high) return -1;

        if(nums[mid]==tar){
            return mid;
        }
        else if(nums[mid]>tar){
            return binarysearch(nums,tar,low,mid-1);
        }
        else return binarysearch(nums,tar,mid+1,high);

    }
    public int search(int[] nums, int target) {
           int n=nums.length;
        return binarysearch(nums,target,0,n-1);






        /*int beg=0;
        int end=nums.length-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) beg=mid+1;
            else if(nums[mid]>target) end=mid-1;
        }
        return -1;*/
    }
}