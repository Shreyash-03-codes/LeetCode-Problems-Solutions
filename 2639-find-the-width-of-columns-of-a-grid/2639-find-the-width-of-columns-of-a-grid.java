class Solution {
    public int[] findColumnWidth(int[][] grid) {
        
        int[] maxWidth=new int[grid[0].length];
        
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                int length=getLength(grid[j][i]);
                if(length>maxWidth[i]){
                    maxWidth[i]=length;
                }
            }
        }
        
        return maxWidth;
    }
    
    private int getLength(int num){
        
        int count=0;
        
        if(num<=0){
            count++;
        }
        
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }
}