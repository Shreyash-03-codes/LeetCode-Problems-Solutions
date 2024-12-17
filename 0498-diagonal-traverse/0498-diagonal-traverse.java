class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        LinkedHashMap<Integer,ArrayList<Integer>> map=new LinkedHashMap<>();
        
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map.get(i+j)==null){
                    map.put(i+j,new ArrayList<>());
                }
                
                map.get(i+j).add(mat[i][j]);
            }
        }
        
        boolean flip=true;
        int[] nums=new int[n*m];
        int k=0;
        for(Integer key:map.keySet()){
            if(flip){
                for(int i=map.get(key).size()-1;i>=0;i--){
                    nums[k++]=map.get(key).get(i);
                }
            }
            else{
                for(Integer e:map.get(key)){
                    nums[k++]=e;
                }
            }
            flip=!flip;
        }
        return nums;
        
    }
}