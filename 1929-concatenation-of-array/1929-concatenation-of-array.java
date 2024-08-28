class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] arr=new int[nums.length*2];
        
        int i=0;
        
        for(int j=0;j<nums.length;j++){
            arr[i++]=nums[j];
        }
        
        for(int j=0;j<nums.length;j++){
            arr[i++]=nums[j];
        }
        
        return arr;
        
    }
}