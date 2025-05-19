class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(ch==')' && stack.peek()=='('){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}