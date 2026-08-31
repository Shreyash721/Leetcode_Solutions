class Solution {
    private boolean issmallestDivisor(int [] nums,int t,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int d=nums[i]/mid;
            if(nums[i]%mid!=0){
                d=d+1;
            }

            sum=sum+d;
        }

        return sum<=t;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int i=1;
        int j=nums[nums.length-1];
        int ans=j;
        while(i<=j){

            int mid=i+(j-i)/2;

            if(issmallestDivisor(nums,threshold,mid)==true){
                ans=mid;
                j=mid-1;
            }

            else{
                i=mid+1;
            }
        }

        return ans;
    }
}