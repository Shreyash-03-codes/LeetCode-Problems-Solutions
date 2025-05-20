class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch) && !stack.isEmpty()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}