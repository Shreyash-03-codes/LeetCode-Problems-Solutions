class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        
        int count=0;
        int maxDivisor=Integer.MIN_VALUE;
        int divisor=0;
     
        for(int i=0;i<divisors.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0){
                    count++;
                }
            }
            
            if(count>maxDivisor){
                maxDivisor=count;
                divisor=divisors[i];
            }
            
            else if(count==maxDivisor){
                divisor=divisor<divisors[i]?divisor:divisors[i];
            }
                            
            count=0;

        }
        return divisor;
    }
}