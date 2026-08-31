class Solution {
    private boolean isminEatingSpeed(int[] nums, int h, long mid){
        
        long sum=0;
        for(int i=0;i<nums.length;i++){
            long d=nums[i]/mid;
            if(nums[i]%mid!=0){
                d=d+1;
            }

            sum=sum+d;

        }

        return sum<=h;

    }

    public int minEatingSpeed(int[] nums, int h) {
        Arrays.sort(nums);
        long i=1;
        long j=nums[nums.length-1];

        long ans=j;

        while(i<=j){
            long mid=i+(j-i)/2;

            if(isminEatingSpeed(nums,h,mid)==true){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }

        return (int)ans;
    }
}