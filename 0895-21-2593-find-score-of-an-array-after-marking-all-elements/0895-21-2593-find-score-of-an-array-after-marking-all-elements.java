class Pair{
    int ele;
    int ind;
    int lAd;
    int rAd;

    Pair(int ele,int ind,int lAd,int rAd){
        this.ele=ele;
        this.ind=ind;
        this.lAd=lAd;
        this.rAd=rAd;
    }
}
class Solution {


    public long findScore(int[] nums) {
        boolean[]visited=new boolean[nums.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair p,Pair q){
                if(p.ele!=q.ele){
                    return p.ele-q.ele;
                }
                return p.ind-q.ind;
            }
        });
        for(int i=0;i<nums.length;i++){
            pq.add(new Pair(nums[i],i,i-1,i+1));
        }
        long score=0;

        while(!pq.isEmpty()){
            Pair p=pq.remove();
            if(!visited[p.ind]){
                visited[p.ind]=true;
                if(p.lAd>=0){
                    visited[p.lAd]=true;
                }
                if(p.rAd<nums.length){
                    visited[p.rAd]=true;
                }
                score+=p.ele;
                
            }
        }
        return score;
    }
}