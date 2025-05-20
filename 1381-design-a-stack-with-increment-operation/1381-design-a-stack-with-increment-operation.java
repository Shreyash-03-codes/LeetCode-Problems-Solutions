class CustomStack {

    Stack<Integer> stack;
    int maxSize=0;
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        this.stack=new Stack<>();
    }
    
    public void push(int x) {
        if(stack.size()<this.maxSize){
            stack.push(x);
        }
    }
    
    public int pop() {
        return stack.isEmpty()?-1:stack.pop();
    }
    
    public void increment(int k, int val) {
        Stack<Integer> s=new Stack<>();
        int i=0;
        int n=stack.size()-k;
        while(i<n){
            i++;
            s.push(stack.pop());
        }
        while(!stack.isEmpty()){
            
            s.push(stack.pop()+val);
        }

        while(!s.isEmpty()){
            
            stack.push(s.pop());
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */