class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a,int []b){
                return a[1]-b[1];
            }
        });

        for(Integer key:map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }

        while(k>0 && !pq.isEmpty()){
            int[] p=pq.poll();

            if(p[1]<=k){
               k-=p[1];
               map.remove(p[0]);
            }
            else{
                break;
            }
        }

        return map.size();
    }
}