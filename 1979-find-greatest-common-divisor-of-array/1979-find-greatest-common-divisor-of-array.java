class Solution {
    public int findGCD(int[] nums) {
        int hcf;
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        hcf=gcd(a,b);

        return hcf;
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        
        return gcd(b,a%b);
    }
}