class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{search(nums,0,nums.length-1,true,target),search(nums,0,nums.length-1,false,target)};
    }

    private int search(int[]nums,int start,int last,boolean left,int target){
        int ind=-1;

        while(start<=last){
            int mid=(start+last)/2;

            if(nums[mid]==target){
                ind=mid;
                if(left){
                    last=mid-1;
                }
                else{
                    start=mid+1;
                }
                
            }
            else if(nums[mid]<target){
                    start=mid+1;
                }
                else{
                    last=mid-1;
                }

        }
        return ind;

    }

}