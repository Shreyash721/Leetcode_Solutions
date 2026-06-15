class Solution {
    public String reversePrefix(String s, int k) {
        char [] st=s.toCharArray();
        int i=0;
        int j=k-1;
        while(i<j){
            char t=st[i];
            st[i]=st[j];
            st[j]=t;
            i++;
            j--;
        }
    return new String(st);
    }
}