class Solution {
    public int findKthLargest(int[] nums, int k) {
//Mathod 1
        // Arrays.sort(nums);
        // int i=nums.length-1;
        // int ele=nums[i];
        // while(k>0){
        //     ele=nums[i];
        //     i--;
        //     k--;
        // }
        // return ele;

// method 2:

        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        // for(int i=0;i<nums.length;i++){
        //     pq.add(nums[i]);
        // }

        // while(k>1){
        //     pq.remove();
        //     k--;
        // }
        // return pq.peek();

// Method 3:
        PriorityQueue<Integer> pq=new PriorityQueue<>(); //Minheap

        for(int ele:nums){
            pq.add(ele);

            if(pq.size()>k) pq.remove();
        }


        return pq.peek();

    }
}