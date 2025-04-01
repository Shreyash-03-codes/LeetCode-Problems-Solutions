class Solution {
    public int maxMoves(int[][] grid) {
        int max=0;
        int[][]dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j]=-1;
            }
        }
        for(int i=0;i<grid.length;i++){
            max=Math.max(max,maxMoves(grid,i-1,1,grid[i][0],dp));
            max=Math.max(max,maxMoves(grid,i,1,grid[i][0],dp));
            max=Math.max(max,maxMoves(grid,i+1,1,grid[i][0],dp));  
        }
        return max;
    }

    private int maxMoves(int[][]mat,int i,int j,int p,int[][]dp){
        if(i<0 || i>=mat.length || j>=mat[0].length){
            return 0;
        }
        if(mat[i][j]<=p){
            return 0;
        }
        if(j==mat[0].length-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int up=maxMoves(mat,i-1,j+1,mat[i][j],dp);
        int right=maxMoves(mat,i,j+1,mat[i][j],dp);
        int down=maxMoves(mat,i+1,j+1,mat[i][j],dp);

        return dp[i][j]= 1 + Math.max(up,Math.max(right,down));
        

    }
}