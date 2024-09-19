class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(Integer key:map.keySet()){
            if(map.get(key)==1){
                sum=sum+key;
            }
        }
        return sum;
    }
}