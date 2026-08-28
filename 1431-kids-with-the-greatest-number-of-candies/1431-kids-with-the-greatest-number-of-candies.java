class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int extra) {
        ArrayList<Boolean> arr=new ArrayList<>();
        int n=extra;
        for(int i=0;i<nums.length;i++){
            boolean flag=true;
            int net=n+nums[i];
            for(int j=0;j<nums.length;j++){
                if(net<nums[j]){
                    flag=false;
                    break;
                }
            }
             arr.add(flag);

        }


            return arr;
            
    }
}