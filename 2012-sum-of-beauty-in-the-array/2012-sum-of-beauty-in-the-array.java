class Solution {
    public int sumOfBeauties(int[] nums) {
        
        int[] maxLeft=new int[nums.length];
        int[] minRight=new int[nums.length];
        
        maxLeft[0]=nums[0];
        minRight[nums.length-1]=nums[nums.length-1];
        
        for(int i=1;i<nums.length;i++){
            maxLeft[i]=Math.max(maxLeft[i-1],nums[i]);
            int j=nums.length-1-i;
            minRight[j]=Math.min(nums[j],minRight[j+1]);
        }
        int op=0;
        
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>maxLeft[i-1] && nums[i]<minRight[i+1]){
                op+=2;
            }
            else if(nums[i]>nums[i-1] && nums[i]<nums[i+1]){
                op+=1;
            }
            
        }
        return op;
        
    }
}