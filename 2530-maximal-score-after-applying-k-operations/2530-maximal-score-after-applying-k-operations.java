class Solution {
    public long maxKelements(int[] nums, int k) {
        
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return b[0]-a[0];
            }
        });
        
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        
        long score=0;
        
        while( k!=0){
            int[] a=pq.remove();
            score=score+(long)a[0];
            double d=(double)a[0]/3;
            int n=(int)Math.ceil(d);
            pq.add(new int[]{n,a[1]});
            k--;
        }
        return score;
    }
}