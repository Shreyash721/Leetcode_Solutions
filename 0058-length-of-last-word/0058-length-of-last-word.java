class Solution {
    public int lengthOfLastWord(String s) {
      int l=s.length()-1;
      int c=0;
      while((int)s.charAt(l)==32) l=l-1;
      while(l>=0){
        if((int)s.charAt(l)==32) break;
        else{
            c++;
        }
        l--;
      } 
    return c;
    }
}