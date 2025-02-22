class Solution {
    public int heightChecker(int[] heights) {
        int[]nums=Arrays.copyOf(heights,heights.length);
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}