class Solution {
    public long[] findPrefixScore(int[] nums) {
        
        long[] result=new long[nums.length];
        
        
        result[0]=(long)nums[0]+(long)nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            
            if(max<nums[i]){
                max=nums[i];
            }
            result[i]=result[i-1]+(long)(nums[i]+max);
        }
        return result;
    }
}