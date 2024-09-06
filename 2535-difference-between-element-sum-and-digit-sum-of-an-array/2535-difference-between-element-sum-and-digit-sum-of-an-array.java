class Solution {
    public int differenceOfSum(int[] nums) {
        int digitSum=0;
        int eleSum=0;
        
        for(int i=0;i<nums.length;i++){
            eleSum+=nums[i];
            digitSum+=getDigitSum(nums[i]);
        }
        
        return Math.abs(eleSum-digitSum);
    }
    
    public int getDigitSum(int n){
        int sum=0;
        
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}