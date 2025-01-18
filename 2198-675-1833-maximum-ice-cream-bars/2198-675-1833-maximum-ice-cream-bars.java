class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);
        int count=0;
        for(int a:costs){
            if(coins<=0){
                break;
            }
            if(a<=coins){
                coins-=a;
                count++;
            }
        }
        return count;
    }
}