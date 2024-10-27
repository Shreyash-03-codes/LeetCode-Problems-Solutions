class Solution {
    public int maxSum(int[][] grid) {
        
        int max=Integer.MIN_VALUE;
        int n=grid.length;
        int m=grid[0].length;
        
        for(int i=0;i<n-2;i++){
            int sum=0;
            for(int j=1;j<m-1;j++){
                sum=grid[i][j-1]+grid[i][j]+grid[i][j+1]+grid[i+1][j]+grid[i+2][j-1]+grid[i+2][j]+grid[i+2][j+1];
                
                max=Math.max(max,sum);
            }
        }
        
        return max;
    }
}