class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();

        for(int n:nums1){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }

        for(int n:nums2){
            map2.put(n,map2.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer key:map1.keySet()){
            if(map2.containsKey(key)){
                int min=Math.min(map1.get(key),map2.get(key));
                for(int i=0;i<min;i++){
                    list.add(key);
                }
            }
        }
        int[]result=new int[list.size()];
        int i=0;
        for(int e:list){
            result[i++]=e;
        }
        return result;
    }
}