class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]p,int[]q){
                if(p[1]!=q[1]){
                    return p[1]-q[1];
                }
                return p[0]-q[0];
            }
        });

        for(int e:arr){
            pq.add(new int[]{e,Math.abs(e-x)});
        }
        List<Integer> list=new ArrayList<>();
        while(!pq.isEmpty() && k!=0){
            list.add(pq.remove()[0]);
            k--;
        }
        Collections.sort(list);
        return list;

    }
}