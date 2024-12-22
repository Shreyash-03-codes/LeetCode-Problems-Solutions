class Solution {
    public int uniquePaths(int m, int n) {
        
        
        int[][] dp=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        
        return paths(m-1,n-1,dp);
    }
    
    private int paths(int i,int j,int[][] dp){
        if(i==0 && j==0){
            return 1;
        }
        
        if(i<0 || j<0){
            return 0;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        
        int up=paths(i-1,j,dp);
        int left=paths(i,j-1,dp);
        dp[i][j]=up+left;
        
        return dp[i][j];
    }
}