class Solution {
    public int[][] merge(int[][] intervals) {
        

        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                if(a[0]!=b[0]){
                    return a[0]-b[0];
                }
                else{
                    return a[1]-b[1];
                }
            }
        });

        for(int[]p:intervals){
            pq.add(p);
        }

        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        while(!pq.isEmpty()){
            int[]p=pq.remove();

            if(result.size()==0){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(p[0]);
                list.add(p[1]);
                result.add(list);
            }
            else if(result.get(result.size()-1).get(1)>=p[0]){
                int max=Math.max(p[1],result.get(result.size()-1).get(1));
                result.get(result.size()-1).set(1,max);
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(p[0]);
                list.add(p[1]);
                result.add(list);
            }
        }

        int[][]rs=new int[result.size()][2];
        int i=0;
        for(ArrayList<Integer> list:result){
            rs[i++]=new int[]{list.get(0),list.get(1)};
        }
        return rs;
    }
}