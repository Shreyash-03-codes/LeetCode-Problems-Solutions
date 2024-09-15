class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        ArrayList<Integer>[] graph=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        
        boolean[] visited=new boolean[n];
        
        for(List<Integer> a:edges){
            visited[a.get(1)]=true;
        }
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                list.add(i);
            }
        }
        
        return list;
    }
}