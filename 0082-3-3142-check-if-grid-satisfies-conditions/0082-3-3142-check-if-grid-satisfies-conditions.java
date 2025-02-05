class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        

        if(grid[0].length==1){
            for(int j=0;j<grid.length-1;j++){
                if(grid[j][0]!=grid[j+1][0]){
                    return false;
                }
            }
        }
        if(grid.length==1){
            for(int j=0;j<grid[0].length-1;j++){
                if( grid[0][j]==grid[0][j+1]){
                    return false;
                }
            }
        }
        
        for(int i=0;i<grid.length;i++){
            
          

            for(int j=0;j<grid[0].length;j++){
                if(i<grid.length-1 && j<grid[0].length-1 && (grid[i][j]!=grid[i+1][j] || grid[i][j]==grid[i][j+1])){
                    return false;
                }
                if(j<grid[0].length-1 && grid[i][j]==grid[i][j+1]){
                    return false;
                }

                if(i<grid.length-1 && grid[i][j]!=grid[i+1][j]){
                    return false;
                }
            }
        }
        
        return true;
    }
}