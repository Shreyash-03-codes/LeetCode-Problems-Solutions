class Solution {
    
    private void subset(int i,int[] nums,List<List<Integer>> result,List<Integer> list){
        if(i==nums.length){
            
            result.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[i]);
        subset(i+1,nums,result,list);
        list.removeLast();
        subset(i+1,nums,result,list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        subset(0,nums,result,list);
        return result;
    }
}