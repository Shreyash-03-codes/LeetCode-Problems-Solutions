class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s:words){
            boolean flag=true;
            int i,j;
            for(i=0,j=s.length()-1;i<=j;i++,j--){
                if(s.charAt(i)!=s.charAt(j)){
                    flag=false;
                }
            }
            if(flag){
                return s;
            }
        }
        return "";
    }
}