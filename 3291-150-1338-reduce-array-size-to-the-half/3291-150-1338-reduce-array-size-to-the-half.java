class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                return b[1]-a[1];
            }
        });

        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(Integer key:map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }

        int n=arr.length;
        int i=0;
        int count=0;
        while(!pq.isEmpty() && i<n/2){
            int[] p=pq.remove();
            i+=p[1];
            count++;
        }

        return count;


    }
}