class Solution {
    public boolean search(int[] nums, int target) {
             
        int start=0;
        int last=nums.length-1;
        
        while(start<=last){
            int mid=(start+last)/2;
            
            if(nums[mid]==target){
                return true;
            }
            if(nums[start]==nums[mid] && nums[mid]==nums[last]){
                start=start+1;
                last=last-1;
            }
            else if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<=nums[mid]){
                    last=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                 if(nums[mid]<=target && target<=nums[last]){
                    start=mid+1;
                }
                else{
                    last=mid-1;
                }
            }
        }
        return false;
    }
}