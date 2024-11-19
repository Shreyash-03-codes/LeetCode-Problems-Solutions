class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start=0;
        int last=nums.length-1;
        
        while(start<=last){
            int mid=(start+last)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            
            else if(target<nums[mid]){
                last=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}