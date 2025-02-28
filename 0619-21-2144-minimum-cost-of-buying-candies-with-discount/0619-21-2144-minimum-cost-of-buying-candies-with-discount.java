class Solution {
    public int minimumCost(int[] cost) {

        if(cost.length==1){
            return cost[0];
        }
        int sum=0;
        Arrays.sort(cost);
        int last=cost.length-1;
        while(last>=0){
            sum+=cost[last];
            last--;
            if(last>=0){
                sum+=cost[last];
                last--;
            }
            last--;
        }
        return sum;
    }
}