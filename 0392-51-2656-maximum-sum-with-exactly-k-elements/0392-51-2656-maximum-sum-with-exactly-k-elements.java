class Solution {
    public int maximizeSum(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        int sum=0;
        for(int e:nums){
            pq.add(e);
        }
        while(k!=0){
            int e=pq.remove();
            sum+=e;
            pq.add(e+1);
            k--;
        }
        
 
        return sum;
    }
}