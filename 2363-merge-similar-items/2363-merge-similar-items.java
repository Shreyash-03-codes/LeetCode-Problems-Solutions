class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int[]arr:items1){
            map.put(arr[0],map.getOrDefault(arr[0],0)+arr[1]);
        }   
        for(int[]arr:items2){
            map.put(arr[0],map.getOrDefault(arr[0],0)+arr[1]);
        }   
        List<List<Integer>> result=new ArrayList<>();
        for(Integer key:map.keySet()){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(key);
            list.add(map.get(key));
            result.add(list);

        }
        return result;
        
    }
}