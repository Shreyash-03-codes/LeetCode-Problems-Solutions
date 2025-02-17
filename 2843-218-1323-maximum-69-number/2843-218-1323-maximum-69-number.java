class Solution {
    public int maximum69Number (int num) {
        
        String s=num+"";
        char[]str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]=='6'){
                str[i]='9';
                break;
            }
        }
        String st=new String(str);
        return Integer.valueOf(st);
    }
}