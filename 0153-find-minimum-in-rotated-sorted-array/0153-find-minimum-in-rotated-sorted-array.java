class Solution {
    public int findMin(int[] nums) {
        
        int start=0;
        int last=nums.length-1;
        
        int min=6000;
        
        while(start<=last){
            int mid=(start+last)/2;
            
            if(nums[start]<=nums[mid]){
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