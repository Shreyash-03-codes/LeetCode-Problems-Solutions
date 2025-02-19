class Solution {
    public int findTheWinner(int n, int k) {
        
        Queue<Integer> que=new LinkedList<>();
        int i=1;
        while(i<=n){
            que.add(i);
            i++;
        }
        while(n>1 && que.size()>1){

            for(i=1;i<k;i++){
                que.add(que.remove());
            }
            que.remove();
            n--;

        }
        return que.remove();
    }
}