class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int []a,int[]b){
                return b[1]-a[1];
            }
        });
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        for(Integer a:map.keySet()){
            pq.add(new int[]{a,map.get(a)});
        }
        
        int[] result=new int[k];
        int i=0;
        while(k!=0){
            int[]a= pq.remove();
            result[i++]=a[0];
            k--;
        }
        return result;
    }
}