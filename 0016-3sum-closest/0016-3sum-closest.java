class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int sum=0;
        int closet=Integer.MAX_VALUE;
        int result=0;
        
        for(int i=0;i<nums.length-2;i++){
            
            int start=i+1;
            int last=nums.length-1;
            
            while(start<last){
                sum=nums[i]+nums[start]+nums[last];
                
                if(sum==target){
                    return sum;
                   
                }
                
                if(sum<target){
                    start++;
                }
                else if(sum>target){
                    last--;
                }
                
                int diff=Math.abs(target-sum);
                
                if(diff<closet){
                    closet=diff;
                    result=sum;
                }
            }
        }
        
        return result;
        
    }
}