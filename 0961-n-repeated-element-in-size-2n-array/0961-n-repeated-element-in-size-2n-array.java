class Solution {
    public int repeatedNTimes(int[] nums) {
     
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Integer key:map.keySet()){
            int n=map.get(key);
            if(n*2==nums.length){
                return key;
            }
        }
        return -1;
    }
}