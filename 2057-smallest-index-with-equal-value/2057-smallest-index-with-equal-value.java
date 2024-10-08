class Solution {
    public int smallestEqual(int[] nums) {
        
        int small=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                if(i<small){
                    small=i;
                }
            }
        }
        
        return small==Integer.MAX_VALUE?-1:small;
    }
}