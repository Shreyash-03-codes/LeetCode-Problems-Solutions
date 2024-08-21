class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        int max=nums[0];
        int min=nums[0];
        
        for(int i=0;i<nums.length;i++){
            
            if(max<nums[i]){
                max=nums[i];
            }
            
            if(min>nums[i]){
                min=nums[i];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
                return nums[i];
            }
        }
        
        return -1;
    }
}