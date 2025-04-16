class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        HashMap<String,Integer> map=new HashMap<>();
        return countPaths(m,n,maxMove,startRow,startColumn,map);
    }

    private int countPaths(int r,int c,int max,int sr,int sc,HashMap<String,Integer> map){
        if(sr<0 || sc<0 || sr>=r || sc>=c){
            return 1;
        }
        if(max==0){
            return 0;
        }
        if(map.containsKey(max+"-"+sr+"-"+sc)){
            return map.get(max+"-"+sr+"-"+sc);
        }
        int up=countPaths(r,c,max-1,sr-1,sc,map);
        int left=countPaths(r,c,max-1,sr,sc-1,map);
        int right=countPaths(r,c,max-1,sr,sc+1,map);
        int down=countPaths(r,c,max-1,sr+1,sc,map);

        int count1=(up+left)%1000000007;
        int count2=(right+down)%1000000007;
        int count=(count1+count2)%1000000007;

        map.put(max+"-"+sr+"-"+sc,count);

        return count;
    }
}