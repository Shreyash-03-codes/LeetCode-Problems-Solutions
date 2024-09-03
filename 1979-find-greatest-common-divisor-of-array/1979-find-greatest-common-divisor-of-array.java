class Solution {
    public int findGCD(int[] nums) {
        
        int large=nums[0];
        int small=nums[0];
     
        for(int i=1;i<nums.length;i++){
            
            if(large<nums[i]){
                large=nums[i];
            }
            
            if(small>nums[i]){
                small=nums[i];
            }
        }
        
        Stack<Integer> stack=new Stack<>();
        
        while(small!=0){
            
            int mod=large%small;
            
            stack.push(mod);
            
            large=small;
            
            small=stack.pop();
        }
        
        return large;
        
    }
}