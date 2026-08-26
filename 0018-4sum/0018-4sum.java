class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;
        while(i < nums.length-3){

        if(i>0 && nums[i]==nums[i-1]){
            i++;
            continue;
        }

        for(int j=i+1;j<nums.length-2;j++){

            if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }

            int p=j+1;
            int q=nums.length-1;

            while(p<q){

            long sum=(long)nums[i]+nums[j]+nums[p]+nums[q];

            if(sum<target) p++;
            else if(sum>target) q--;
            else{
                List<Integer> arr=new ArrayList<>();

                arr.add(nums[i]);
                arr.add(nums[j]);
                arr.add(nums[p]);
                arr.add(nums[q]);

                ans.add(arr);

                p++;
                q--;

                while(p<q && nums[p]==nums[p-1]) p++;
                while(p<q && nums[q]==nums[q+1]) q--;
            }
            }
        }

        i++;
        }

        return ans;
    }
}
