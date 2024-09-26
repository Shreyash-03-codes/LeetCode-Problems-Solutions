class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        int lucky;
        boolean flag;
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
                lucky=matrix[i][j];
            
            
            flag=true;

            for(int k=0;k<matrix[0].length;k++){
                if(matrix[i][k]<lucky){
                    flag=false;
                }
            }

            for(int l=0;l<matrix.length;l++){
                if(matrix[l][j]>lucky){
                    flag=false;
                }
            }

            if(flag){
                list.add(lucky);
            }
        }

        }
        return list;
        
    }
}