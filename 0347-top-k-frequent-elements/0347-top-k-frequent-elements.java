class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] arr=new int[k];
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       } 
       for(int i=0;i<k;i++){
        int max=0;
        int num=0;
        for(int n:map.keySet()){
            if(map.get(n)>max){
                max=map.get(n);
                num=n;
            }
        }
        arr[i]=num;
        map.remove(num);
       }

       return arr;
    }
}