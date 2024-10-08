class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        
      for(int i=0;i<n;i++){
          graph.add(new ArrayList<>());
      }
        
        for(int[] e:edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        boolean[] visited=new boolean[n];
        
        Queue<Integer> queue=new LinkedList<>();
        
        queue.add(source);
        visited[source]=true;
        
        while(!queue.isEmpty()){
            
            int node=queue.poll();
            
            if(node==destination){
                return true;
            }
            
            else{
             
                for(int e:graph.get(node)){
                    if(!visited[e]){
                        visited[e]=true;
                        queue.add(e);
                    }
                }
             
            }
        }
        return false;
    }
}