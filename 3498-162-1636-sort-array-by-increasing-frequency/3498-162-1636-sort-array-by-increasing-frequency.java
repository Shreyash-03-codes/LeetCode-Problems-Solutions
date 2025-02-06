class Solution {
    public int[] frequencySort(int[] nums) {
        
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                if(a[1]!=b[1]){
                    return a[1]-b[1];
                }

                return b[0]-a[0];
            }
        });

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(Integer key:map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }

        int[]result=new int[nums.length];
        int k=0;
        while(!pq.isEmpty()){
            int[]p=pq.remove();
            for(int i=0;i<p[1];i++){
                result[k++]=p[0];
            }
        }
        return result;
    }
}