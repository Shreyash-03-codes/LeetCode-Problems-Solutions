class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int[]arr:nums){
            for(int a:arr){
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }

        ArrayList<Integer> list=new ArrayList<>();

        for(Integer key:map.keySet()){
            if(map.get(key)==nums.length){
                list.add(key);
            }
        }
        return list;
    }
}