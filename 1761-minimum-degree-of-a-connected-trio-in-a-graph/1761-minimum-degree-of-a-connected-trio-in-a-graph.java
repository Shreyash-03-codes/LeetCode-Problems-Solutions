class Solution {
    public int minTrioDegree(int n, int[][] edges) {
        
        int[][] graph = new int[n+1][n+1];
        
        int[] degree=new int[n+1];
        
        for(int[] a:edges){
            
            int x=a[0];
            int y=a[1];
            graph[x][y]=1;
            graph[y][x]=1;
            
            degree[x]++;
            degree[y]++;
        }
        
        int result=Integer.MAX_VALUE;
        
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                
                if(graph[i][j]!=1){
                    continue;
                }
                
                for(int k=j+1;k<=n;k++){
                    if( graph[i][k]==1 && graph[j][k]==1){
                        
                        result=Math.min(result,(degree[i]+degree[j]+degree[k]-6));
                      
                    }
                }
            }
        }
        
        if(result==Integer.MAX_VALUE){
            return -1;
        }
        
        return result;
    }
}