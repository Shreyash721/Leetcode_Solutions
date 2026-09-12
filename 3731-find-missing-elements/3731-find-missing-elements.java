class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();

        for(int x:nums){
            set.add(x);
        }

        for(int i=min;i<max;i++){
            if(!set.contains(i)) arr.add(i);
        }

        return arr;
    }
}