class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        

        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int[]arr:mat){
            for(int e:arr){
                list.add(e);
            }
        }

        int k=0;
        int[][]nums=new int[r][c];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                
                    nums[i][j]=list.get(k);
                    k++;
         
                
            }
        }
        return nums;
    }
}