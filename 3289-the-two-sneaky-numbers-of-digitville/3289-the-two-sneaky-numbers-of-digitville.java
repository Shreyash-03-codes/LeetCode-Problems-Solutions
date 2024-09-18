class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int[] result=new int[2];
        int k=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        for(Integer key:map.keySet()){
            if(map.get(key)>1){
                result[k++]=key;
            }
        }
        
        return result;
    }
}