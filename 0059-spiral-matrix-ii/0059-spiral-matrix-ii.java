class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] mat=new int[n][n];
        
        int top=0;
        int bottom=n-1;
        
        int left=0;
        int right=n-1;
        
        int k=1;
        
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                mat[top][i]=k;
                k++;
            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                mat[i][right]=k;
                k++;
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    mat[bottom][i]=k;
                    k++;
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    mat[i][left]=k;
                    k++;
                }
                left++;
            }
        }
        return mat;
    }
}