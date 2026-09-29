class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] arr= new int [101];
        for(int x:nums){
            arr[x]++;
        }
        int[] ans=new int[nums.length];
        int index=0;
        while(index<nums.length){
            for(int x=1;x<=100;x++){
                if(arr[x]>0){
                    ans[index++]=x;
                    arr[x]--;
                }
            }
        }
        return ans;
    }
}