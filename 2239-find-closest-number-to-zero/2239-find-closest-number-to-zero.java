class Solution {
    public int findClosestNumber(int[] nums) {
        
        int closet=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            
            if(Math.abs(nums[i])<Math.abs(closet) || nums[i]==Math.abs(closet)){
                closet=nums[i];
            }
        }
        return closet;
    }
}