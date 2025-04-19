class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int e:nums){
            pq.add(e);
        }
        int count=0;

        while(!pq.isEmpty()){
            int num=pq.remove();
            if(num==0){
                continue;
            }
        PriorityQueue<Integer> temp=new PriorityQueue<>();
            while(!pq.isEmpty()){
                int n=pq.remove();
                if(n-num!=0){
                    temp.add(n-num);
                }

            }
            pq=temp;
            count++;
        }
        return count;
    }
}