class Solution {
    public int maximumProduct(int[] nums, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int a:nums){
            pq.add(a);
        }

        while(k!=0){
            int n= pq.remove();
            pq.add(n+1);
            k--;
        }

        long pro=1;

        while(!pq.isEmpty()){
            int n=pq.remove();
            pro=(pro*n)%1000000007;
        }
        return (int) pro;
    }
}