class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i=0,j=0,k=0;
        int[] c= new int[m+n];
        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<m){
            c[k++]=a[i++];
        }
        while(j<n){
            c[k++]=b[j++];
        }
        i=0;
        for(int x : c){
           a[i++]=x;
        }
    }
}