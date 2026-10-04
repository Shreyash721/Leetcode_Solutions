class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String [] arr=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String st=arr[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(st)){
                    return false;
                }
            }
            else{
                if(set.contains(st)){
                    return false;
                }

            }

            set.add(st);
            map.put(ch,st);
        }

        return true;
    }
}