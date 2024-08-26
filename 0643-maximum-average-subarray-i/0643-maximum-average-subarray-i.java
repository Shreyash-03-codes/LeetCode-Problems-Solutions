class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        
        int start=0;
        int end=k;
        
        int maxSum=sum;
        
        while(end<nums.length){
            
            sum-=nums[start++];
            
            sum+=nums[end++];
            
            maxSum=Math.max(sum,maxSum);
        }
        
        return (double) maxSum/k;
    }
}