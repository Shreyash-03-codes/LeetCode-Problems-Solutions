class Solution {
    public int minOperations(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int count=0;
        for(Integer key:map.keySet()){
            int freq=map.get(key);
            if(freq==1){
                return -1;
            }

            count+=(freq+2)/3;
        }
        return count;
    }
}