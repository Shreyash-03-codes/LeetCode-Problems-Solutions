class Solution {
    public int reductionOperations(int[] nums) {
        
        Arrays.sort(nums);
        int op=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]==nums[i-1]){
                continue;
            }
            op+=(nums.length-i);
        }
        
        return op;
    }
}