class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int i=0,j=0,k=0;
        int[] c=new int[a.length + b.length];
        while(i<a.length && j< b.length){
           if(a[i]<b[j])  c[k++]=a[i++];
           else c[k++]=b[j++];
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        if(c.length % 2 == 0){
            return (c[c.length/2] + c[c.length/2 - 1]) / 2.0;
        }
        else{
            return c[c.length/2];
        }
    }
}