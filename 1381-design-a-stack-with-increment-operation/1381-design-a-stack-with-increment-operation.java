class CustomStack {

    int[] stack;
    int top;
    int size;
    int capacity;
    
    public CustomStack(int maxSize) {
        stack=new int[maxSize];
        top=-1;
        size=0;
        capacity=maxSize;
    }
    
    public void push(int x) {
        
        if(size==capacity){
            return;
        }
        
        top++;
        size++;
        stack[top]=x;
        
    }
    
    public int pop() {
        
        if(size==0){
            return -1;
        }
        
        int val=stack[top];
        top--;
        size--;
        return val;
    }
    
    public void increment(int k, int val) {
        
        if(size==0){
            return;
        }
        int n=Math.min(k,size);
        
        for(int i=0;i<n;i++){
            stack[i]+=val;
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