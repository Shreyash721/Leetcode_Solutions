class Solution {
    public String largestWordCount(String[] m, String[] s) {
        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<m.length;i++){
            map.put(s[i],map.getOrDefault(s[i],0)+m[i].split(" ").length);
        }

        String str="";
        int max=0;

        for(String w:map.keySet()){
            int l=map.get(w);
            if(l>max || (l==max && w.compareTo(str)>0)){
                max=l;
                str=w;
            }
        }

        return str;
    }
}

