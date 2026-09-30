class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String st:strs){
            char[] ch=st.toCharArray();
            Arrays.sort(ch);
            String key= new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(st);
        }
        List<List<String>> ans= new ArrayList<>(map.values());
        return ans;
    }
}