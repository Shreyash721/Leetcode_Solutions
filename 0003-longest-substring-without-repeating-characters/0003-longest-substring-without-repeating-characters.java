class Solution {
    public int lengthOfLongestSubstring(String s) {
       int c=0;
       int max=0;
       for(int i=0;i<s.length();i++) {
        String str="";
        for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
            if(str.contains(String.valueOf(ch))){
                break;
            }
            str=str+ch;
            c=str.length();
            max=Math.max(max,c);
        }
       }

       return max;
    }
}