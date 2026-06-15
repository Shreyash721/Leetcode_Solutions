class Solution {
    public int findGCD(int[] nums) {
        int hcf=1;
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];

        for(int i=2;i<=a;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
}