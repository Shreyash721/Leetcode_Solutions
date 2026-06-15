class Solution {
    public int search(int[] nums, int target) {
        int idx = -1;

    
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                idx = i;
                break;
            }
        }

       
        if (idx >= 0) {

            
            int l = 0;
            int r = idx;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) r = mid - 1;
                else l = mid + 1;
            }

            
            int l1 = idx + 1;
            int r1 = nums.length - 1;
            while (l1 <= r1) {
                int mid = (l1 + r1) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) r1 = mid - 1;
                else l1 = mid + 1;
            }
        } 
        else {
            
            int m = 0;
            int n = nums.length - 1;
            while (m <= n) {
                int mid = (m + n) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) n = mid - 1;
                else m = mid + 1;
            }
        }

        return -1;
    }
}