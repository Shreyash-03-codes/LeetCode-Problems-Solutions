class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] str=s.toCharArray();
        
        int i=0;
        int j=str.length-1;
        
        while(i<j){
            if(Character.isLetter(str[i]) && Character.isLetter(str[j])){
                char a=str[i];
                str[i]=str[j];
                str[j]=a;
                i++;
                j--;
            }
            
            else if(Character.isLetter(str[i]) && !Character.isLetter(str[j])){
                j--;
            }
            
            else if(!Character.isLetter(str[i]) && Character.isLetter(str[j])){
                i++;
            }
            else{
                i++;
                j--;
            }
            
            
        }
        
        String t=new String(str);
        
        return t;
    }
}