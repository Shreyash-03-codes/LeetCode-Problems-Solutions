class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){

            if(!stack.isEmpty() && s.charAt(i)==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb=new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        sb.reverse().toString();

        return sb.toString();
        
    }
}