class Solution {
    public int[] sortArrayByParity(int[] nums) {

        for(int i=0;i<nums.length;i++){
            
            if(nums[i]%2==0){

                int val=nums[i];

                for(int j=i;j>0;j--){
                    nums[j]=nums[j-1];
                }

                nums[0]=val;
            }
        }
        return nums;
    }
}