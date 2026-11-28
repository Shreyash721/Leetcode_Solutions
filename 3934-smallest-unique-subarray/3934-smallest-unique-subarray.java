import java.util.*;

class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n=nums.length;
        int[] sa=new int[n];
        int[] rank=new int[n];
        int[] temp=new int[n];
        int[] nextRank=new int[n];
        for(int i=0;i<n;i++){
            sa[i]=i;
            rank[i]=nums[i];
        }
        int classes=0;
        int[] sorted=new int[n];
        int[] count=new int[n+2];
        int[] vals=nums.clone();
        Arrays.sort(vals);
        int[] unique=new int[n];
        int m=0;
        for(int x:vals){
            if(m==0 || unique[m-1]!=x)
                unique[m++]=x;
        }
        for(int i=0;i<n;i++){
            rank[i]=Arrays.binarySearch(unique,0,m,nums[i]);
        }
        classes=m;
        for(int k=1;k<n;k*=2){
            countingSort(sa,temp,rank,k,classes,n);
            countingSort(temp,sa,rank,0,classes,n);
            int newClasses=1;
            nextRank[sa[0]]=0;
            for(int i=1;i<n;i++){
                int a=sa[i-1],b=sa[i];
                int a2=a+k<n?rank[a+k]:-1;
                int b2=b+k<n?rank[b+k]:-1;
                if(rank[a]!=rank[b] || a2!=b2)
                    newClasses++;
                nextRank[b]=newClasses-1;
            }
            int[] swap=rank;
            rank=nextRank;
            nextRank=swap;
            classes=newClasses;
            if(classes==n) break;
            if(k>n/2) break;
        }
        int[] pos=new int[n];
        for(int i=0;i<n;i++)
            pos[sa[i]]=i;
        int[] lcp=new int[n];
        int h=0;
        for(int i=0;i<n;i++){
            int r=pos[i];
            if(r==0) continue;
            int j=sa[r-1];
            while(i+h<n && j+h<n && nums[i+h]==nums[j+h])
                h++;
            lcp[r]=h;
            if(h>0) h--;
        }
        int ans=n;
        for(int r=0;r<n;r++){
            int i=sa[r];
            int common=lcp[r];
            if(r+1<n)
                common=Math.max(common,lcp[r+1]);
            if(common<n-i)
                ans=Math.min(ans,common+1);
        }
        return ans;
    }
    private void countingSort(int[] in,int[] out,int[] rank,
                           int offset,int classes,int n){
        int[] count=new int[classes+1];
        for(int x:in){
            int key=(x+offset<n)?rank[x+offset]+1:0;
            count[key]++;
        }
        for(int i=1;i<count.length;i++)
            count[i]+=count[i-1];
        for(int i=n-1;i>=0;i--){
            int x=in[i];
            int key=(x+offset<n)?rank[x+offset]+1:0;
            out[--count[key]]=x;
        }
    }
}