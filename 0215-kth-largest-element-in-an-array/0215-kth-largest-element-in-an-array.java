class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // int i=nums.length-1;
        // int ele=nums[i];
        // while(k>0){
        //     ele=nums[i];
        //     i--;
        //     k--;
        // }
        // return ele;


        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        while(k>1){
            pq.remove();
            k--;
        }
        return pq.peek();
    }
}