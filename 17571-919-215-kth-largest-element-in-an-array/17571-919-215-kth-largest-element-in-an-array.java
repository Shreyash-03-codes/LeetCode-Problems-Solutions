class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer n1,Integer n2){
                return n2-n1;
            }
        });

        for(int e:nums){
            pq.add(e);
        }

        while(!pq.isEmpty() && k!=0){
            int n=pq.remove();
            k--;
            if(k==0){
                return n;
            }
        }

        return -1;

    }
}