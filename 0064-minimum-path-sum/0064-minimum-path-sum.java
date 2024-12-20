class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] memo=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                memo[i][j]=-1;
            }
        }
        return min(n-1,m-1,grid,memo);
    }
    
    public int min(int i,int j,int[][] grid,int[][]memo){
        if(i==0 && j==0){
            return grid[i][j];
        }
        
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        
        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        
        int left=min(i-1,j,grid,memo);
        int right=min(i,j-1,grid,memo);
       
        memo[i][j]=grid[i][j]+Math.min(left,right);
        return memo[i][j];
        
        
    }
}