
class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int t = 0;
        for(int i = 0; i < n; i++) {
            t+=nums[i];
        }
        int target = t-x;
        if(target<0) return -1;
        if(target==0) return n;
        int left = 0;
        int sum = 0;
        int maxLen = -1;
        for(int right =0;right<n;right++) {
            sum += nums[right];
            while(sum>target) {
                sum-=nums[left];
                left++;
            }
            if(sum==target) {
                maxLen=Math.max(maxLen, right - left + 1);
            }
        }

        if(maxLen == -1) return -1;

        return n - maxLen;
    }
}
