class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(map.get(i-j)==null){
                    map.put(i-j,new PriorityQueue<>(new Comparator<Integer>(){
                        public int compare(Integer a,Integer b){
                            return a-b;
                        }
                    }));
                }
                
                map.get(i-j).add(mat[i][j]);
            }
        }
        
        int[][] nums=new int[mat.length][mat[0].length];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                
                nums[i][j]=map.get(i-j).remove();
            }
        }
        
        return nums;
        
    }
}