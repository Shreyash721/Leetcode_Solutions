class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] arr=new int[2];
        int max=-1;
        int r=mat.length;
        int c=mat[0].length;
        int p=0;
        for(int i=0;i<r;i++){
            int cnt=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==1) cnt++;
            }
            if(cnt>max){
                max=cnt;
                arr[p]=i;
                arr[p+1]=cnt;
            }
        }
        return arr;
    }
}