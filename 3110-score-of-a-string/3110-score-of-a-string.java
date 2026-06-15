class Solution {
    public int scoreOfString(String s) {
        int n;
        int sum=0;
        int l=s.length();
        for(int i=1;i<l;i++){
            char ch=s.charAt(i);
            char chh=s.charAt(i-1);
            n=chh-ch;
            if(n<0) n=-(n);
            sum=sum+n;
        }


    return sum;
    }
}