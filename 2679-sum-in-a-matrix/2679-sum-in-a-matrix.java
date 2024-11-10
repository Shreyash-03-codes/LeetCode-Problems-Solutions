class Solution {
    public int matrixSum(int[][] nums) {
        
        for(int[] a:nums){
            Arrays.sort(a);
        }
        int n=nums.length;
        int m=nums[0].length;
        int sum=0;
        for(int i=0;i<m;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(nums[j][i]>max){
                    max=nums[j][i];
                }
            }
            sum+=max;
        }
        return sum;
    }
}