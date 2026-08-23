class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int [] num=nums;
        List<List<Integer>> arr=new ArrayList<>();
        long p=(long)lower-1;
        for(int n:num){
            if(n<lower||n>upper) continue;

            if((long)n-p >1){
                ArrayList<Integer> ans=new ArrayList<>();
                ans.add((int)(p+1));
                ans.add(n-1);
                arr.add(ans);
            }


            p=n;
        }
        if((long)upper-p>0){
            ArrayList<Integer> ans=new ArrayList<>();
            ans.add((int)(p+1));
            ans.add(upper);
            arr.add(ans);
        }


        return arr;
        
    }
}