class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        HashMap<String,Integer> map=new HashMap<>();
        return ways(n,k,target,map);
    }

    private int ways(int n,int k,int target,HashMap<String,Integer> map){

        if(target==0 && n==0){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        if(map.containsKey(n+"-"+target)){
            return map.get(n+"-"+target);
        }
        int sum=0;
        for(int i=1;i<=k;i++){
            sum=(sum+ways(n-1,k,target-i,map))%1000000007;
            
        
        }
        map.put(n+"-"+target,sum);
        return sum;

        
    }
}