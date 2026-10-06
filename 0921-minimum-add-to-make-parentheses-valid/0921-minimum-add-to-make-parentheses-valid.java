class Solution {
    public int minAddToMakeValid(String s) {
        int b1=0;
        int cnt=0;
        for (char ch:s.toCharArray()) {
            if(ch=='(') {
                b1++;
            }
            else{
                if(b1>0){
                    b1--;
                }
                else{
                    cnt++;
                }
            }
        }
        return cnt+b1;
    }
}
