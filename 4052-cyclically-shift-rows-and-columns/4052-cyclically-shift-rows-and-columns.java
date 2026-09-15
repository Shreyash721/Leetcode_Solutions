class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        for(int i=0;i<n;i++){
            int k=rowShift[i]%n;
            int[] temp=new int[n];

        for(int j=0;j<n;j++){
            temp[(j-k+n)%n]=grid[i][j];
        }
        grid[i]=temp;
    }
    

     for(int j=0;j<n;j++){
            int k=colShift[j]%n;
            int[] temp=new int[n];
    
        for(int i=0;i<n;i++){
            temp[(i-k+n)%n]=grid[i][j];
        }
        for(int i=0;i<n;i++){
            grid[i][j]=temp[i];
        }
    }

    return grid;
    }
    
}