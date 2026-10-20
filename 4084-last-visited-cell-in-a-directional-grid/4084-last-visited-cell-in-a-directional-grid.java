class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int r=0;
        int c=0;
        visited[0][0]=true;

        while(true){
            int nr=r;
            int nc=c;
            char dir=grid[r][c];
            switch(dir){
                case 'D': nr++;break;
                case 'U': nr--;break;
                case 'R': nc++;break;
                case 'L': nc--;break;   
            }

            if(nr<0||nr>=m||nc<0||nc>=n){
                return new int[]{r,c};
            }
            if(visited[nr][nc]){
                return new int[]{r,c};
            }

            r=nr;
            c=nc;
            visited[r][c]=true;
        }
    }
}