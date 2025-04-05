class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[]result=new int[nums.length];
        boolean[]visited=new boolean[nums.length];
        
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                result[stack.peek()]=nums[i];
                visited[stack.peek()]=true;
                stack.pop();
            }

            stack.push(i);
        }
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                result[stack.peek()]=nums[i];
                visited[stack.peek()]=true;
                stack.pop();
            }

           
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                result[i]=-1;
            }
        }
        return result;
    }
}