class Solution {
    public int climbStairs(int n) {
        
        int[]dp=new int[n+1];
        
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        
        return count(0,n,dp);
    }
    
    private int count(int i,int n,int[]dp){
        if(i==n){
            return 1;
        }
        
        if(i>n){
            return 0;
        }
        
        if(dp[i]!=-1){
            return dp[i];
        }
        
        int one=count(i+1,n,dp);
        int two=count(i+2,n,dp);
        
        return dp[i]=one+two;
    }
}