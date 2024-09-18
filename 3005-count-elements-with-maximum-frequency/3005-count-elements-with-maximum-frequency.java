class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        int maxFreq=Integer.MIN_VALUE;
        
        for(Integer key:map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq=map.get(key);
            }
        }
        
        int sum=0;
        
        for(Integer key:map.keySet()){
            if(map.get(key)==maxFreq){
                sum=sum+maxFreq;
            }
        }
        
        return sum;
    }
}