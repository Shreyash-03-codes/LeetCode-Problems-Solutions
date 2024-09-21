class Solution {
    
    static class Edge{
        int src;
        int dest;
        int wt;
        
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    
    static class Pair {
        int dist;
        int node;
        
        Pair(int dist,int node){
            this.dist=dist;
            this.node=node;
        }
        
     
    }
    
    static ArrayList<Edge>[] graph;
    
    public int[] dijkstras(int src,int[] disappear,int n){
        
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(p -> p.dist));
        boolean[] visited=new boolean[n];
        int[] distance=new int[n];
        
        for(int i=0;i<n;i++){
            if(i!=src){
                distance[i]=Integer.MAX_VALUE;
            }
        }
        
        pq.add(new Pair(0,0));
        
        while(!pq.isEmpty()){
            
            Pair p=pq.remove();
            
            if(!visited[p.node]){
                visited[p.node]=true;
           
                
                for(int i=0;i<graph[p.node].size();i++){
                    int s=graph[p.node].get(i).src;
                    int d=graph[p.node].get(i).dest;
                    int w=graph[p.node].get(i).wt;
                    
                    if(distance[s]+w<distance[d] && distance[s]+w<disappear[d]){
                        distance[d]=distance[s]+w;
                        pq.add(new Pair(distance[d],d));
                    }
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(distance[i]>=disappear[i]){
                distance[i]=-1;
            }
        }
        return distance;
        
    }
    
    public void createGraph(int n,int[][] edges){
        graph=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int[] a:edges){
            graph[a[0]].add(new Edge(a[0],a[1],a[2]));
            graph[a[1]].add(new Edge(a[1],a[0],a[2]));
            
        }
    }
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        createGraph(n,edges);
        return dijkstras(0,disappear,n);
    }
}