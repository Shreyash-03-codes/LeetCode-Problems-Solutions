class Solution {
    public void duplicateZeros(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0 &&i+1<nums.length){
                for(int j=nums.length-1;j>i+1;j--){
                    nums[j]=nums[j-1];
                }
                nums[i+1]=0;
                i++;
            }
        }
    }
}