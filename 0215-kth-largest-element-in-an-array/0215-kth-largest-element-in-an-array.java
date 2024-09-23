class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length<k){
            return nums[nums.length-1];
        }
        else{
            return nums[nums.length-k];
        }
        
    }
}