class Solution {
    public int kthFactor(int n, int k) {
        int j=0;
        int arr[]=new int[n];
        for(int i=1;i<=n;i++){
          if(n%i==0){
            arr[j++]=i;
          }
        }
        if(k>j){
            return -1;
        }
        return arr[k-1];
    }
}