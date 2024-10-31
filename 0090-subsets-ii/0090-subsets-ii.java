class Solution {
   
            private void subset(int i,int[] nums,List<List<Integer>> result,List<Integer> list,HashSet<ArrayList<Integer>> set){
        if(i==nums.length){
            
            ArrayList<Integer> sort=new ArrayList<>(list);
            Collections.sort(sort);
            if(!set.contains(sort)){
                result.add(new ArrayList<>(list));
                set.add(sort);
            }
            return;
        }
        
        
        subset(i+1,nums,result,list,set);
        list.add(nums[i]);
        subset(i+1,nums,result,list,set);
        list.removeLast();
    }
   public List<List<Integer>> subsetsWithDup(int[] nums) {
        
       HashSet<ArrayList<Integer>> set=new HashSet<>();
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        subset(0,nums,result,list,set);
        return result;
    }
    
}