class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int[] nums:matrix){
            int start=0;
            int last=nums.length-1;
            
            while(start<=last){
                int mid=(start+last)/2;
                
                if(nums[mid]==target){
                    return true;
                    
                }
                
                if(target<nums[mid]){
                    last=mid-1;
                }
                
                if(target>nums[mid]){
                    start=mid+1;
                }
                
                
            }
        }
        return false;
    }
}