class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        
        int targetArrival=times[targetFriend][0];
        
        Arrays.sort(times,new Comparator<int[]>(){
           public int compare(int[] a,int[] b) {
               return a[0]-b[0];
           }
        });
        
        PriorityQueue<int[]> occupied=new PriorityQueue<>(new Comparator<int[]>(){
           public int compare(int[] a,int[] b) {
               return a[0]-b[0];
           }
        });
        
        PriorityQueue<Integer> availabel=new PriorityQueue<>();
        
        int chNo=0;
        
        for(int[] time:times){
            int arrTime=time[0];
            int leavTime=time[1];
            
            while(!occupied.isEmpty() && occupied.peek()[0]<=arrTime){
                availabel.offer(occupied.poll()[1]);
            }
            
            int curChair;
            if(availabel.isEmpty()){
                curChair=chNo++;
            }
            else{
                curChair=availabel.poll();
            }
            
            if(targetArrival==arrTime){
                return curChair;
            }
            
            occupied.offer(new int[]{leavTime,curChair});
        }
        return -1;
    }
}