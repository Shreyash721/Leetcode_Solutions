class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str=new ArrayList<>();
        GP(n,0,0,"",str);
        return str;
    }
    public void GP(int n,int l,int r,String s,List<String> str){
        if(r==n && l==n){
            str.add(s);
            return;
        }
        if(l<n) GP(n,l+1,r,s+"(",str);

        if(r<l) GP(n,l,r+1,s+")",str);
    }
}