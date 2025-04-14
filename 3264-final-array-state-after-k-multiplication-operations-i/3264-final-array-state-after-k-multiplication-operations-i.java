class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]p,int[] q){
                if(p[0]!=q[0]){
                    return p[0]-q[0];
                }
                    return p[1]-q[1];
            }
        });

        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }

        while(k!=0){
            k--;
            int[]p=pq.remove();
            p[0]=p[0]*multiplier;
            pq.add(p);
        }
        while(!pq.isEmpty()){
            int[]p=pq.remove();
            nums[p[1]]=p[0];
        }
        return nums;
    }
}