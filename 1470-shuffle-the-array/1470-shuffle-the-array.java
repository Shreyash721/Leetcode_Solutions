class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr=new int[n*2];
        for(int i=0;i<n;i++){
            int m=i%2;
            arr[2*i]=nums[i];
            arr[2*i+1]=nums[i+n];
        }
        return arr;
    }
}