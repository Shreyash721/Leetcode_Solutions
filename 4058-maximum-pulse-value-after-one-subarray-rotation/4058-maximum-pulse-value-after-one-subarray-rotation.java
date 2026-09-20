class Solution {
    public long maxValue(int[] nums) {
        int n=nums.length;
        long x=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                x=x+nums[i];
            }
            else{
                x=x-nums[i];
            }
        }
        int [] arr=nums;
        long p=0;
        long[] max={0,Long.MIN_VALUE};
        long min=Long.MAX_VALUE;
        for(int i=1;i<=n;i++){
            int j=i-1;
            if(j%2==0){
                p+=arr[j];
            }
            else{
                p=p-arr[j];
            }
            int pr=i%2;
            if(max[pr]!=Long.MIN_VALUE){
                min=Math.min(min,p-max[pr]);
            }
            max[pr]=Math.max(max[pr],p);
        }
        if(min==Long.MAX_VALUE) return x;
        long m=Math.max(0L,-2L*min);
        return x+m;
    }
}