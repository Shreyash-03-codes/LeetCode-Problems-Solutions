class Solution {
    public double minimumAverage(int[] nums) {
        
        double ave=0.0;
        Arrays.sort(nums);
        double min=Double.MAX_VALUE;
   
        int start=0;
        int last=nums.length-1;
        
        while(start<last){
            ave=((double)nums[start]+(double)nums[last])/2;
            min=Math.min(min,ave);
            start++;
            last--;
        }
        return min;
    }
}