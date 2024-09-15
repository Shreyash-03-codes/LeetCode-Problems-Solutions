class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
 
        int[][] graph=new int[n][n];
        
        int[] indegree=new int[n];
        
        for(int[] a:roads){
            graph[a[0]][a[1]]=1;
            graph[a[1]][a[0]]=1;
            
            indegree[a[0]]++;
            indegree[a[1]]++;
            
        }
        
        int max=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(i==j){
                    continue;
                }
                
                int rank=indegree[i]+indegree[j]-graph[i][j];
                
                max=Math.max(max,rank);
                
            }
        }
        return max;
    }
}