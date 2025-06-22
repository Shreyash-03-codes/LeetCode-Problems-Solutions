class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        if(s.length()%k!=0){
            int add=k-(s.length()%k);
            for(int i=0;i<add;i++){
                sb.append(fill);
            }
        }
        s=sb.toString();
        String[]str=new String[s.length()/k];
        int j=0;
        for(int i=0;i<s.length();i=i+k){
            str[j++]=s.substring(i,i+k);
        }
        return str;
    }
}