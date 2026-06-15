class Solution {
    public int finalValueAfterOperations(String[] s) {
        int x=0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals("--X") || s[i].equals("X--")) x=x-1;
            else x=x+1;
        }
        return x;
    }
}