class Solution {
    private boolean ismaximumCandies(int[] nums, long k, int mid){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            long d=nums[i]/mid;

            sum=sum+d;

        }
        return sum>=k;



        }
    public int maximumCandies(int[] nums, long k) {
        Arrays.sort(nums);
        int i=1;
        int j=nums[nums.length-1];
        int ans=0;


        while(i<=j){

            int mid=i+(j-i)/2;
            
            if(ismaximumCandies(nums,k,mid)){
                ans=mid;
                i=mid+1;
            }

            else{
                j=mid-1;
            }
        }


        return (int)ans;
    }

}