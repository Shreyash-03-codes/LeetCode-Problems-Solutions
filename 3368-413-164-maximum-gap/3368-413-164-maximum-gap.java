class Solution {
    public int maximumGap(int[] nums) {
        
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int gap=0;

        for(int i=0;i<nums.length-1;i++){
            gap=nums[i+1]-nums[i];
            if(gap>max){
                max=gap;
              
            }
        }

        return max==Integer.MIN_VALUE?0:max;
    }
}