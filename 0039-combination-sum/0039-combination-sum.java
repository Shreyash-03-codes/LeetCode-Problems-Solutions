class Solution {
    
    private void comb(int i,int[] nums,int target,List<List<Integer>> result, List<Integer> list){
       
        if(i==nums.length){
            if(target==0){
                result.add(new ArrayList<>(list));
                
            }
            return;
        }
    
        
        if(nums[i]<=target){
            
            list.add(nums[i]);
            comb(i,nums,target-nums[i],result,list);
            
            list.removeLast();
        }
        
        comb(i+1,nums,target,result,list);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        comb(0,candidates,target,result,list);
        return result;
        
    }
}