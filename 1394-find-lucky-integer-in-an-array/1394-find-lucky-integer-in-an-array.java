class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        int lucky=-1;
        
        for(Integer n:map.keySet()){
            if(n==map.get(n)){
                if(lucky<n){
                    lucky=n;
                }
            }
        }
        return lucky;
    }
}