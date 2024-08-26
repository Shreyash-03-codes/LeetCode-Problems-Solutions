class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }

            if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){

                if(stack.isEmpty()){
                    return false;
                }

                if(match(stack.peek(),s.charAt(i))){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
        
    }

    public boolean match(char a,char b){

        if((a=='(' && b==')')  || (a=='{' && b=='}')  || (a=='[' && b==']')){
            return true;
        }
        return false;
    }
}