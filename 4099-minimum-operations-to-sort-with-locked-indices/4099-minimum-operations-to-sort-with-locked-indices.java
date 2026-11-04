class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
int n=nums.length;
        int[] p=new int[n];
        int[] s=new int[n];

        p[0]=nums[0];
        s[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            s[i]=Math.min(s[i+1],nums[i]);
        }
        for(int i=1;i<n;i++){
            p[i]=Math.max(p[i-1],nums[i]);
        }
        int ul=0;
        int[][] st={nums,locked};
        
        for(int i=0;i<n;i++){
            if(p[i]>s[i] && st[1][i]==1){
                ul++;
            }
        }
        if(ul>k) return -1;
        int[] bit=new int[n+1];
        long sn=0;
        for(int i=n-1;i>=0;i--){
            int x=st[0][i];
            int j=x-1;
            while(j>0){
                sn=sn+bit[j];
                j=j-(j&-j);
            }
            j=x;
            while(j<=n){
                bit[j]++;
                j=j+(j&-j);
            }
        }
        return (int)(sn+ul);
    }
}