class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int[]result=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i%n]>=nums[stack.peek()]){
                stack.pop();
            }
            result[i%n]=stack.isEmpty()?-1:nums[stack.peek()];
            stack.push(i%n);
        }
        return result;
    }
}