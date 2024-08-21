class Solution {
    public int maximumCount(int[] nums) {
        
        int pos=0;
        int neg=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg++;
            }
            if(nums[i]>0){
                pos++;
            }
        }
        int max;
        if(pos>neg){
            max=pos;
        }
        else{
            max=neg;
        }
        return max;
        
    }
}