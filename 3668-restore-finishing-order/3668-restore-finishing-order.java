class Solution {
    public int[] recoverOrder(int[] nums, int[] friends) {
        int [] arr=new int[friends.length];
        int p=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<friends.length;j++){
                if(nums[i]==friends[j]){
                    arr[p]=nums[i];
                    p++;
                }
            }
        }
        return arr;

    }      
}