class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[]result=new int[queries.length];
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        int count=0;
        map.put(x,new HashMap<>());
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                count++;
                map.get(x).put(count,i);
            }
        }
        int i=0;
        for(int e:queries){
            Integer ind=map.get(x).get(queries[i]);
            if(ind!=null){
                result[i++]=ind;
            }
            else{
                result[i++]=-1;
            }
        }
        return result;
    }
}