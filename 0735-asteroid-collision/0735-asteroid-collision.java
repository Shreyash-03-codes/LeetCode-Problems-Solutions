class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack=new Stack<>();

        for(int e:asteroids){
            boolean flag=true;
            while(!stack.isEmpty() && e<0 && stack.peek()>0){
                
                if(stack.peek()<Math.abs(e)){
                    stack.pop();
                }
                else if(stack.peek()>Math.abs(e)){
                    e=0;
                    break;
                }
                else{
                    e=0;
                    stack.pop();
                    break;
                }
            }
            if(e!=0){
                stack.push(e);
            }
        }
        int[]nums=new int[stack.size()];
        int i=stack.size()-1;
        while(!stack.isEmpty()){
            nums[i--]=stack.pop();
        }
        return nums;
    }
}