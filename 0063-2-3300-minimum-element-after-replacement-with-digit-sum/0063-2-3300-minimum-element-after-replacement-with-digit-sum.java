class Solution {
    public int minElement(int[] nums) {
        
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n!=0){
                sum+=(n%10);
                n/=10;
            }
            min=Math.min(sum,min);
        
        }
        return min;
    }
}