class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(trust.length==0 && n==1){
            return 1;
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        
        for(int[] a:trust){
            map.put(a[1],map.getOrDefault(a[1],0)+1);
        }
        
        for(int[] a:trust){
            set.add(a[0]);
        }
        
        for(Integer key:map.keySet()){
            if(!set.contains(key)){
                if(map.get(key)==n-1){
                    return key;
                }
            }
        }
        return -1;
    }
}