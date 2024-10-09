class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] visited=new boolean[rooms.size()];
        
        DFS(rooms,0,visited);
        
        for(int i=0;i<rooms.size();i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
    
    private void DFS(List<List<Integer>> rooms,int src,boolean[] visited){
        
        visited[src]=true;
        
        for(int i=0;i<rooms.get(src).size();i++){
            if(!visited[rooms.get(src).get(i)]){
                DFS(rooms,rooms.get(src).get(i),visited);
            }
        }
    }
}