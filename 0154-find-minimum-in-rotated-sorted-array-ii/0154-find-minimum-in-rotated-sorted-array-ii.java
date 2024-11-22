class Solution {
    public int findMin(int[] nums) {
     
        if(nums.length==1){
            return nums[0];
        }
        int start=0;
        int last=nums.length-1;
        
        int min=6000;
        
        while(start<=last){
            int mid=(start+last)/2;
            
            if(nums[start]==nums[mid] && nums[mid]==nums[last]){
                min=Math.min(nums[start],min);
                start++;
                last--;
            }
            
            else if(nums[start]<=nums[mid]){
                min=Math.min(nums[start],min);
                start=mid+1;
            }
            else{
                 min=Math.min(nums[mid],min);
                last=mid-1;
            }
        }
        return min;
    }
}