class Solution {
    public int maxDistance(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    if(max<Math.abs(i-j)){
                        max=Math.abs(i-j);
                    }
                }
            }
        }
        return max;
    }
}