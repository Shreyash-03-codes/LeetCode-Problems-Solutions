class Solution {
    public boolean isPalindrome(String s) {
        
        String p=s.toLowerCase();
        String k=p.replaceAll(" ","");
        String t=k.replaceAll("_","");
        String z=t.replaceAll("\\W+","");
        int i,j;
        for(i=0,j=z.length()-1;i<=j;i++,j--){
            if(z.charAt(i)!=z.charAt(j)){
                return false;
            }
        }
        
        return true;
    }
}