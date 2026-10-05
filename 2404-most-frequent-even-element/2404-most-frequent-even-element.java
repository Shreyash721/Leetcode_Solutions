class Solution {
    public int mostFrequentEven(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
      }
       int max=0;
       int num=-1;
      for(int k:map.keySet()){
        if(k%2==0 && (map.get(k)>max || (map.get(k)==max && k<num))){
            max=map.get(k);
            num=k;
        }
      }
      return num;
    }
}