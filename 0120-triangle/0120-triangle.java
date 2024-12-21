class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n=triangle.size();
        int[][] dp=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        
        return min(0,0,n,triangle,dp);
    }
    
    public int min(int i,int j,int n,List<List<Integer>> list,int[][] dp){
        
        if(i==n-1){
            return list.get(i).get(j);
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int down=min(i+1,j,n,list,dp);
        int right=min(i+1,j+1,n,list,dp);
        
        dp[i][j]=list.get(i).get(j)+Math.min(right,down);
        return dp[i][j];
        
        
    }
}