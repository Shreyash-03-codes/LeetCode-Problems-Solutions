class Solution {
    public int[] finalPrices(int[] prices) {
        
        int[]result=new int[prices.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            while(!stack.isEmpty() && prices[i]<stack.peek()){
                stack.pop();
            }
            result[i]=stack.isEmpty()?0:stack.peek();
            stack.push(prices[i]);
        }
        for(int i=0;i<prices.length;i++){
            result[i]=prices[i]-result[i];
        }
        return result;
    }
}