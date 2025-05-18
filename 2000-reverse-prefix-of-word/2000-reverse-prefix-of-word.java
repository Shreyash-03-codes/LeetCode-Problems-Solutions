class Solution {
    public String reversePrefix(String word, char ch) {

        if(!word.contains(ch+"")){
            return word;
        }
        Stack<Character> stack=new Stack<>();

        for(char c:word.toCharArray()){
            stack.push(c);
            if(c==ch){
                break;
            }
        }
        char[]str=word.toCharArray();
        int i=0;
        while(!stack.isEmpty()){
            str[i++]=stack.pop();
        }
        return new String(str);
    }
}