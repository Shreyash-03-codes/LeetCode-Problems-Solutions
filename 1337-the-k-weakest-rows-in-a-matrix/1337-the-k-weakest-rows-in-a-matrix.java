class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]p,int[]q){
                if(p[1]!=q[1]){
                    return p[1]-q[1];
                }
                return p[0]-q[0];
            }

        });

        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }

            pq.add(new int[]{i,count});
        }

        int[]result=new int[k];
        int i=0;
        while(k!=0 && !pq.isEmpty()){
           
                result[i++]=pq.remove()[0];
                k--;
          
        }
        return result;
    }

}