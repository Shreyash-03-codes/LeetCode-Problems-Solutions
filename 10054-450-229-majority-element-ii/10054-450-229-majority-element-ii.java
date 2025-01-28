class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        List<Integer> list=new ArrayList<>();

        for(Integer key:map.keySet()){
            if(map.get(key)>nums.length/3){
                list.add(key);
            }
        }

        return list;
    }
}