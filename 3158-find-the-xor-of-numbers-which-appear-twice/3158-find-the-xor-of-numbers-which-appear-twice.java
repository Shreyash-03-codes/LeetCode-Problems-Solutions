class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        int xor=0;

        for(int i=0;i<nums.length-1;i++){
            for(int j=1+i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    xor=xor^nums[i];
                }
            }
        }
        return xor;
        
    }
}