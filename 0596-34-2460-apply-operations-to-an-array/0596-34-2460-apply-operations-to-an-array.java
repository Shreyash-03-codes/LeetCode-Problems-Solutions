class Solution {
    public int[] applyOperations(int[] nums) {

        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int[]arr=new int[nums.length];
        int i=0;
        for(int a:nums){
            if(a!=0){
                arr[i++]=a;
            }
        }
        for(int a:nums){
            if(a==0){
                arr[i++]=a;
            }
        }
        return arr;
        
    }
}