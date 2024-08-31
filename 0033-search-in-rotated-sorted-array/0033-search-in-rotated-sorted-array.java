class Solution {
    public int search(int[] nums, int target) {
        
        return binarySearch(nums,target,0,nums.length-1);
        
    }
    
    public int binarySearch(int[] nums,int target,int start,int last){
        
        if(start>last){
            return -1;
        }
        
        int mid=(start+last)/2;
        
        if(nums[mid]==target){
            return mid;
        }
        
        if(nums[start]<=nums[mid]){
            if(target>=nums[start] && target<=nums[mid]){
                return binarySearch(nums,target,start,mid-1);
                
            }
            else {
                return binarySearch(nums,target,mid+1,last);
                
            }
     
        }
        else{
            if(target>=nums[mid] && target<=nums[last]){
                return binarySearch(nums,target,mid+1,last);
            }
        }
        
       return binarySearch(nums,target,start,mid-1);
    }
}