class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        
        for(int a:stones){
            pq.add(a);
        }
        while(pq.size()!=1){
            int x=pq.remove();
            int y=pq.remove();
            
            if(x!=y){
                if(x<y){
                    pq.add(y-x);
                }
                else{
                    pq.add(x-y);
                }
            }
            
            
            if(pq.isEmpty()){
                return 0;
            }
        }
        
        return pq.remove();
    }
}