class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        
        for(char a:str1){
            if(a=='#' && stack1.isEmpty()){
                continue;
            }
            if(a=='#' && !stack1.isEmpty()){
                stack1.pop();
            }
            else{
                stack1.push(a);
            }
        }
        
        for(char a:str2){
            
            if(a=='#' && stack2.isEmpty()){
                continue;
            }
            if(a=='#' && !stack2.isEmpty()){
                stack2.pop();
            }
            else{
                stack2.push(a);
            }
        }
        
        if(stack1.size()!=stack2.size()){
            return false;
        }
        
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.pop()!=stack2.pop()){
                return false;
            }
        }
        
        return true;
        
    }
}