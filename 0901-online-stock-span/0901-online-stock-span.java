class StockSpanner {

    Stack<int[]> stack;
    public StockSpanner() {
        stack=new Stack<>();
    }
    
    public int next(int price) {

        if(stack.isEmpty()){
            stack.add(new int[]{price,1});
            return 1;
        }
        
            int count=1;
            while(!stack.isEmpty() && price>=stack.peek()[0]){
                count+=stack.pop()[1];
            }
            stack.push(new int[]{price,count});
            return count;
        

        // stack.push(price);
        // int count=0;
        // Queue<Integer> que=new LinkedList<>();
        // while(!stack.isEmpty() && price>=stack.peek()){
        //     count++;
        //     int n=stack.pop();
        //     que.add(n);
        // }

        // while(!que.isEmpty()){
        //     stack.push(que.remove());
        // }
        // return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */