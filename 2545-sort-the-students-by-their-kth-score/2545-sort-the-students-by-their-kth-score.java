class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]p,int[]q){
                if(p[0]!=q[0]){
                    return q[0]-p[0];
                }
                return q[1]-p[1];
            }
        });
        int i=0;
        for(int[]p:score){
            pq.add(new int[]{p[k],i});
            i++;
        }

        i=0;
        int[][]grid=new int[score.length][];
        while(!pq.isEmpty()){
            grid[i]=score[pq.remove()[1]];
            i++;
        }
        return grid;
    }
}