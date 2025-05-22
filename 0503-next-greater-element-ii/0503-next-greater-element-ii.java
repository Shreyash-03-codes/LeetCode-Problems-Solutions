class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[]result=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                result[stack.peek()]=nums[i];
            
                stack.pop();
            }

            stack.push(i);
        }
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                result[stack.peek()]=nums[i];
              
                stack.pop();
            }

           
        }
        while(!stack.isEmpty()){
            
            result[stack.pop()]=-1;

        }
        return result;
    }
}