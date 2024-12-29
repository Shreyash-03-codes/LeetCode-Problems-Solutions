class Solution {
    
    private void comb(int i,int[] nums,int target,List<List<Integer>> result,List<Integer> list){
        
         if(target==0){
                result.add(new ArrayList<>(list));
                return;
            }
          
 
        
   for(int j=i;j<nums.length;j++){

        if(j>i && nums[j]==nums[j-1]){
            continue;
        }
        if(nums[j]>target){
            break;
        }
        list.add(nums[j]);
        comb(j+1,nums,target-nums[j],result,list);
        list.removeLast();
        
   }
        
       
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        Arrays.sort(candidates);
        comb(0,candidates,target,result,list);
        return result;
    }
}