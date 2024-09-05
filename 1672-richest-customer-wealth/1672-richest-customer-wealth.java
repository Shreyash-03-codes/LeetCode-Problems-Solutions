class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int wealth=0;
        
        for(int[] i:accounts){
            int sum=0;
            for(int j=0;j<i.length;j++){
                sum+=i[j];
            }
            if(sum>wealth){
                wealth=sum;
            }
        }
        return wealth;
        
    }
}