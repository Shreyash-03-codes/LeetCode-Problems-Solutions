class Solution {
    public int findMin(int[] nums) {
        
     
        int start=0;
        int last=nums.length-1;
        int min=Integer.MAX_VALUE;
        
        while(start<=last){
            int mid=(start+last)/2;
            
            if(nums[start]<=nums[mid]){
                min=Math.min(min,nums[start]);
                start=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                last=mid-1;
            }
        }
        return min;
    }
}