class Solution {
    public String reverseVowels(String s) {
        
        int i=0;
        int j=s.length()-1;
        
        HashSet<Character> set=new HashSet<>();
        set.add('A');
        set.add('a');
        set.add('E');
        set.add('e');
        set.add('I');
        set.add('i');
        set.add('O');
        set.add('o');
        set.add('U');
        set.add('u');
        
        char[] str=s.toCharArray();
        while(i<j){
            if(set.contains(str[i]) && set.contains(str[j])){
                
                char a=str[i];
                str[i]=str[j];
                str[j]=a;
                
                i++;
                j--;
            }
            
            else if(set.contains(str[i]) && !set.contains(str[j])){
                j--;
            }
            
                else if(!set.contains(str[i]) && set.contains(str[j])){
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