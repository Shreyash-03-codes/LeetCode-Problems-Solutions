class MinStack {
    
    Stack<Integer> stack;
    Stack<Integer> help;

    public MinStack() {
        stack=new Stack<>();
        help=new Stack<>();
    }
    
    public void push(int val) {
       if(help.isEmpty() || val<=help.peek()){
            help.push(val);
       }
       stack.push(val);
        
     
    }
    
    public void pop() {
        
        if(!stack.isEmpty() && !help.isEmpty() && stack.peek().equals(help.peek())){
            help.pop();
        }
        stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }
    
    public int getMin() {
         if(help.isEmpty()){
            return -1;
        }
        return help.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */