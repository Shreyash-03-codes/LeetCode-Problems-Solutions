class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        while(!map.isEmpty()){
            List<Integer> l=new ArrayList<>();
            Iterator<Integer> iterator=map.keySet().iterator();
            while(iterator.hasNext()){
                Integer key=iterator.next();
                l.add(key);
                map.put(key,map.get(key)-1);
                if(map.get(key)==0){
                    iterator.remove();
                }
            }
            list.add(l);
        }
        return list;
    }
}