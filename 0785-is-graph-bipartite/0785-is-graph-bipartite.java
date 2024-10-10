class Solution {
    
    private boolean DFS(int[][] graph,int node,int[] color,int currColor){
        color[node]=currColor;
        for(int i=0;i<graph[node].length;i++){
            if(color[graph[node][i]]==color[node]){
                return false;
            }
            
            if(color[graph[node][i]]==-1){
                int c=1-currColor;
                if(!DFS(graph,graph[node][i],color,c)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                if(!DFS(graph,i,color,1)){
                    return false;
                }
            }
        }
        return true;
    }
}