class Solution {
    public int maxWidthRamp(int[] nums) {
        
        int ramp=0;
        int maxRamp=Integer.MIN_VALUE;
        
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<nums.length;i++){
            if(stack.isEmpty() || nums[i]<nums[stack.peek()]){
                stack.push(i);
            }
        }
        
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&&nums[stack.peek()]<=nums[i]){
              maxRamp=Math.max(maxRamp,i-stack.pop());
            }
             if(stack.isEmpty()){
                    break;
            }
        }
        return maxRamp==Integer.MIN_VALUE?0:maxRamp;
    }
}