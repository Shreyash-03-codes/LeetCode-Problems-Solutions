class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        int j=0;
        for(int[]arr:grid){
            Arrays.sort(arr);
            for(int i=arr.length-limits[j++];i<arr.length;i++){
                pq.add(arr[i]);
            }
        }
        long sum=0;
        while(!pq.isEmpty() && k!=0){
            sum+=pq.remove();
            k--;
        }
        return sum;

    }
}