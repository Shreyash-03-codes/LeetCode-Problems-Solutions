class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int[] nums:matrix){
            if(nums[0]<= target && target<=nums[nums.length-1]){
                int start=0;
                int last=nums.length-1;
                
                while(start<=last){
                    int mid=(start+last)/2;
                    
                    if(nums[mid]==target){
                        return true;
                    }
                    
                    else if(target<nums[mid]){
                        last=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }
            
        }
        return false;
    }
}