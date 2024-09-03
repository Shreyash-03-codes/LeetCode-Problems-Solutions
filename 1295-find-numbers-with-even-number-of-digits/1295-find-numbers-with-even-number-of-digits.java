class Solution {
    public int findNumbers(int[] nums) {
        
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(getDigit(nums[i])%2==0){
                count++;
            }
        }
        return count;
        
    }
    
    
    public int getDigit(int num){
        
        int i=0;
        
        while(num!=0){
            num=num/10;
            i++;
        
        }
        
        return i;
    }
}