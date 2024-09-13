class Solution {
    public int findCenter(int[][] edges) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int[] a:edges){
           
                map.put(a[0],map.getOrDefault(a[0],0)+1);
         
         
                map.put(a[1],map.getOrDefault(a[1],0)+1);
          
        }
        
        
        int freq=0;
        int node=0;
        
        for(Map.Entry<Integer,Integer> set:map.entrySet()){
         
            int cf=set.getValue();
            int n=set.getKey();
            if(freq<cf){
                node=n;
                freq=cf;
            }
        }
        return node;
    }
}