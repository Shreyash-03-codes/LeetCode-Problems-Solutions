class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result=new int[2];
        result[0]=search(nums,target,true);
        result[1]=search(nums,target,false);
        return result;
    }
    
    private int search(int[] nums,int target,boolean leftSearch){
        int start=0;
        int last=nums.length-1;
        int index=-1;
        
        while(start<=last){
            int mid=(start+last)/2;
            
            if(nums[mid]==target){
                index=mid;
                if(leftSearch){
                    last=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(target<nums[mid]){
                last=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
}