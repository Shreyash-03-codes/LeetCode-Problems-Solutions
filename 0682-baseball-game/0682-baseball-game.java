class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack=new Stack<>();
        for(String s:operations){
            if(s.equals("D")){
                int d=stack.peek()*2;
                stack.push(d);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("+")){
                int top=stack.pop();
                int sum=top+stack.peek();
                stack.push(top);
                stack.push(sum);
            }
            else{
                stack.push(Integer.parseInt(s));
            }

        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}