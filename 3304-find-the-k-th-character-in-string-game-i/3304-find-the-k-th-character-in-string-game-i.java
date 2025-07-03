class Solution {
    public char kthCharacter(int k) {
        String str="a";
        while(str.length()<k){
            StringBuilder sb=new StringBuilder();
            for(char ch:str.toCharArray()){
                sb.append((char)(ch+1));
            }
            str=str+sb.toString();
        }
        return str.charAt(k-1);
    }
}