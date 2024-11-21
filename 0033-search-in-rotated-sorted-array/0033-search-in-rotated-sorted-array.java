class Solution {
    public int search(int[] nums, int target) {
        
        int start=0;
        int last=nums.length-1;
        
        while(start<=last){
            int mid=(start+last)/2;
            
            if(target==nums[mid]){
                return mid;
            }
            
            if(nums[start]<=nums[mid]){
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
        return -1;
    }
}