class Solution {
    public boolean searchMatrix(int[][] grid, int target) {
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(target==grid[i][j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}