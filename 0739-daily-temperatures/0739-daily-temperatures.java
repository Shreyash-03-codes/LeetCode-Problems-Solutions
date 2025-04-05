class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack=new Stack<>();

        int[]result=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int e=temperatures[i];
            if(stack.isEmpty()){
                stack.push(i);
            }
           
            while(!stack.isEmpty() && temperatures[stack.peek()]<e){
                result[stack.peek()]=i-stack.pop();
            }
            
            stack.push(i);
        }
        return result;
    }

   
}