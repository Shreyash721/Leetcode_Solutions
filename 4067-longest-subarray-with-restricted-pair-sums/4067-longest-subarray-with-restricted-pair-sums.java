class Solution {
    boolean isValid(HashMap<Integer,Integer> map){
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        for(int i=0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                int a=list.get(i);
                int b=list.get(j);
                if(a==b && map.get(a)<2) continue;
                int sum=a+b;
                if(map.containsKey(sum)){
                    if(sum==a && sum==b){
                    if(map.get(sum)>=3) return false;
                }
                if(sum==a || sum==b){
                    if(map.get(sum)>=2) return false;
                }
                else return false;
                }
            }
        }
        return true;
        }
    
    public int maxSubarray(int[] nums) {
        int n=nums.length;
        int ans=0,left=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<n;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(!isValid(map)){
                int x=nums[left++];
                map.put(x,map.get(x)-1);
                if(map.get(x)==0){
                    map.remove(x);
                }
            }
            ans=Math.max(ans,r-left+1);
        }
       return ans;
    }
}