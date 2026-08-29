class Solution {
    public String[] largestString(int[] nums) {
        int [] ans=nums;
        String [] str=new String[nums.length];

        for(int i=0;i<nums.length;i++){
            int x=ans[i];
            StringBuilder s=new StringBuilder();

            for(int j=25;j>=0; j--){
                int p=(int)Math.pow(2,j);
                while(x>=p){
                    s.append((char)('a'+j));
                    x=x-p;
                }
            }
            str[i]=s.toString();
        }

        return str;
    }
}