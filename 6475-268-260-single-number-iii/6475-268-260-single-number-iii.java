class Solution {
    public int[] singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }

        int[] result=new int[2];
        int i=0;

        for(Integer key:map.keySet()){
            if(map.get(key)==1){
                result[i++]=key;
            }
        }

        return result;
    }
}