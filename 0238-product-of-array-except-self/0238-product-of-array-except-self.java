class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] sufix=new int[n];
        
        prefix[0]=nums[0];
        sufix[n-1]=nums[n-1];
        
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        for(int i=n-2;i>=0;i--){
            sufix[i]=sufix[i+1]*nums[i];
        }
        int[] result=new int[n];
        result[0]=sufix[1];
        result[n-1]=prefix[n-2];

        for(int i=1;i<nums.length-1;i++){
            result[i]=prefix[i-1]*sufix[i+1];
        }
        return result;
        
     
    }
}