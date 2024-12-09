class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a,int[]b){
                if(a[1]!=b[1]){
                    return a[1]-b[1];
                }
                return a[0]-b[0];
            }
        });
        
        for(int[] a:intervals){
            pq.add(a);
        }
        
        
        int end=Integer.MIN_VALUE;
        int count=0;
        while(!pq.isEmpty()){
            int[] p=pq.remove();
            if(end<=p[0]){
                end=p[1];
                
                
                
            }
            else{
               count++;
                
            }
        
        }
        return count;
    }
}