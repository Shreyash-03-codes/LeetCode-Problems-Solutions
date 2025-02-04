class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        
        LinkedHashMap<Integer,List<Integer>> map=new LinkedHashMap<>();
        int n=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
                if(map.get(i+j)==null){
                    map.put(i+j,new ArrayList<>());
                }

                map.get(i+j).add(nums.get(i).get(j));
                n++;
            }
        }

        int[] result=new int[n];
        int k=0;
        for(Integer key :map.keySet()){
            for(int i=map.get(key).size()-1;i>=0;i--){
                result[k++]=map.get(key).get(i);
            }
        }

        return result;
    }
}