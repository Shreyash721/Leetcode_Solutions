class Solution {
    public boolean searchMatrix(int[][] mat, int target) 
    {
      int i=0;
      int j=mat[0].length-1;
      while(i<mat.length && j>=0)
      {
        if(mat[i][j]==target) return true;
        if(mat[i][j]<target) i++;
        else if(mat[i][j]>target) j--;
      }   
    return false;
    }   
}