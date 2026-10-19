class Solution {
    public List<String> buildArray(int[] target, int n) {
        int l=target.length;
        List<String> ans=new ArrayList<>();
        int min=target[0];
        int max=target[l-1];
        HashSet<Integer> set=new HashSet<>();
        for(int x:target) set.add(x);

        for(int i=1;i<=max;i++){
            if(set.contains(i)) ans.add("Push");
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }


        return ans;
    }
}