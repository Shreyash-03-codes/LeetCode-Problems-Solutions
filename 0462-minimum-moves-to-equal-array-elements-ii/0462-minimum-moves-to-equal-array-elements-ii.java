class Solution {
    public int minMoves2(int[] nums) {
        
        int moves=0;
        Arrays.sort(nums);
        int mid=nums.length/2;
        int ele=nums[mid];
        for(int i=0;i<nums.length;i++){
            moves+=Math.abs(ele-nums[i]);
        }
        
        return moves;
    }
}