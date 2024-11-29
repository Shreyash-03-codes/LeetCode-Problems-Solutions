class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result=new int[2];
        result[0]=search(nums,target,false);
        result[1]=search(nums,target,true);
        return result;
        
        
    }
    
    public int search(int[] nums,int target,boolean isRightSearch){
        int start=0;
        int last=nums.length-1;
        int result=-1;
        while(start<=last){
            int mid=(start+last)/2;
            if(nums[mid]==target){
                result=mid;
                if(isRightSearch){
                    start=mid+1;
                }
                else{
                    last=mid-1;
                }
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return result;
    }
}