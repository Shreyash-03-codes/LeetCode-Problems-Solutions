class Solution {
    private void DFS(int[][] graph,int src,int dest,List<List<Integer>> result,List<Integer> list,boolean[] visited){
        
        if(src==dest){
            result.add(new ArrayList<>(list));
            return;
        }
        
        visited[src]=true;
        
        for(int i=0;i<graph[src].length;i++){
            int d=graph[src][i];
            if(!visited[d]){
                list.add(d);
                DFS(graph,d,dest,result,list,visited);
                list.removeLast();
                visited[d]=false;
            }
        }
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(0);
        boolean[] visited=new boolean[graph.length];
        DFS(graph,0,graph.length-1,result,list,visited);
        return result;
    }
}