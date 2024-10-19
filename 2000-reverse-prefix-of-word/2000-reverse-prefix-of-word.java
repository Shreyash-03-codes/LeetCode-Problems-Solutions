class Solution {
    public String reversePrefix(String word, char ch) {
        
        Stack<Character> stack=new Stack<>();
        
        char[] str=word.toCharArray();
        boolean flag=false;
        for(char a:str){
            if(a==ch){
                flag=true;
                stack.push(a);
                break;
            }else{
                stack.push(a);
            }
        }
        
        if(!flag){
            return new String(str);
        }
        int i=0;
        while(!stack.isEmpty()){
            str[i++]=stack.pop();
        }
        
        return new String(str);
    }
}