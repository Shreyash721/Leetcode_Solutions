class Solution {
    public int[][] transpose(int[][] nums) {
        
        int r=nums.length;
        int c=nums[0].length;
        int [][] arr=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[j][i]=nums[i][j];
            }
        }
        return arr;
    }
}