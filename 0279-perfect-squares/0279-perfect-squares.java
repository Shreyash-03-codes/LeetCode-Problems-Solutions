class Solution {
    public int numSquares(int n) {
        int s=(int)Math.sqrt(n);
        int[]nums=new int[s+1];
        for(int i=0;i<=s;i++){
            nums[i]=i*i;
        }
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);

        return num(nums,n,dp);
    }

    private int num(int[]nums,int n,int[]dp){
        if(n<0){
            return Integer.MAX_VALUE;
        }
        if(n==0){
            return 0;
        }

        if(dp[n]!=-1){
            return dp[n];
        }
        int min=Integer.MAX_VALUE;

        for(int e:nums){
            if(e==0){
                continue;
            }
   
            int ans=num(nums,n-e,dp);
            if(ans!=Integer.MAX_VALUE){
                min=Math.min(min,ans+1);
            }
        }

        return dp[n]= min;
    }
}