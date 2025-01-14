class Solution {
    public int minMoves(int[] nums) {
        
        int moves=0;
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int max=nums[0];
       
        
        for(int i=0;i<nums.length;i++){
            moves+=Math.abs(max-nums[i]);
        }
        return moves;
    }
}