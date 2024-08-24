class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int odd=1;
        int even=0;
        
        int[] arr=new int[nums.length];
        
        for(int i:nums){
            if(i%2==0){
                arr[even]=i;
                even+=2;
            }
            
            if(i%2==1){
                arr[odd]=i;
                odd+=2;
            }
        }
        
        return arr;
        
    }
}