class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String s;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            s=words[i];
            for(int j=0;j<s.length();j++){
                if(x==s.charAt(j)){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}