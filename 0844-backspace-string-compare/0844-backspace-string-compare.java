class Solution {
    public boolean backspaceCompare(String s, String t) {

        if(!s.contains("#") && !t.contains("#")){
            return s.equals(t);
        }
        Stack<Character> sStack =new Stack<>();
        Stack<Character> tStack =new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#' && sStack.isEmpty()){
                continue;
            }

            if(ch=='#' && !sStack.isEmpty()){
                sStack.pop();
            }
            else{
                sStack.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch=='#' && tStack.isEmpty()){
                continue;
            }
            
            if(ch=='#' && !tStack.isEmpty()){
                tStack.pop();
            }
            else{
                tStack.push(ch);
            }
        }

        if(sStack.size()!=tStack.size()){
            return false;
        }
        if(!sStack.isEmpty() && !tStack.isEmpty()){
            if(sStack.pop()!=tStack.pop()){
                return false;
            }
        }
        return true;
        
    }
}