class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r=matrix.length;
        int c=matrix[0].length;
        
        int[][] temp=new int[r][c];
       
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[i][j]=matrix[i][j];
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<c;k++){
                        temp[i][k]=0;
                        
                    }
                    for(int k=0;k<r;k++){
                        temp[k][j]=0;
                        
                    }
                    
                }
                
            }
        }
        
        for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                matrix[i][j]=temp[i][j];
            }
        }
    }
}