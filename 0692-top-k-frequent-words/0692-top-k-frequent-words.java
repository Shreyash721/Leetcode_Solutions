class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        for(int i=0;i<k;i++){
            int max=0;
            String s="";
            for(String st:map.keySet()){
                if(map.get(st)>max || (map.get(st)==max && st.compareTo(s)<0)){
                    max=map.get(st);
                    s=st;
                }
            }
            list.add(s);
            map.remove(s);
        }
        return list;
    }
}