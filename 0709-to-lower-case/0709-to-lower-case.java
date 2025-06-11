class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append((char)(s.charAt(i)+32)).append("");
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}