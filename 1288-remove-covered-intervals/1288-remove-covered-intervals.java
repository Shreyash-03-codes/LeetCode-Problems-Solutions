class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        
            Arrays.sort(intervals,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
  
        int count=0;
        int prev=0;
        for(int[] nums:intervals){
            if(nums[1]>prev){
                prev=nums[1];
                count++;
            }
            
        }
        
        return count;
    }
}