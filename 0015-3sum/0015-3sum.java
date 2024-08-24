class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        Set<List<Integer>> result=new HashSet<>();
        
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int last=nums.length-1;
            
            while(start<last){
                
                int sum=nums[i]+nums[start]+nums[last];
                
                if(sum==0){
                    
                    result.add(Arrays.asList(nums[i],nums[start],nums[last]));
                    start++;
                    last--;
                }
                else if(sum<0){
                    start++;
                }
                else{
                    last--;
                }
            }
        }
        
        return new ArrayList<>(result);
    }
}