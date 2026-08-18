class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        int max=0;
        while(j<nums.length){

            int d=nums[j]-nums[i];
            max=Math.max(d,max);

            i++;
            j++;
        }


        return max;
    }
}