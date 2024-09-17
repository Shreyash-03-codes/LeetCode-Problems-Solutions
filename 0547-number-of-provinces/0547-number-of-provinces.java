class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        boolean[] visited=new boolean[isConnected.length+1];
        
        int count=0;
        
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i+1]){
                DFS(i,visited,isConnected);
                count++;
            }
        }
        
        return count;
    }
    
    public void DFS(int node,boolean[] visited,int[][] graph){
        if(!visited[node+1]){
            
            visited[node+1]=true;
            
            for(int i=0;i<graph.length;i++){
                if(graph[node][i]==1 && !visited[i+1]){
                DFS(i,visited,graph);
                }
            }
        }
    }
}