class Solution {
    public int search(int[] nums, int target) {
        
        return binarySearch(nums,0,nums.length-1,target);
        
    }
    
    public int binarySearch(int[] nums,int start,int last,int target){
        
        while(start<=last){
            int mid=start+(last-start)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            
            else if(nums[mid]<target){
                start=mid+1;
            }
            
            else if(nums[mid]>target){
                last=mid-1;
            }
        }
        return -1;
    }
}