class Solution {
    public boolean halvesAreAlike(String s) {
        
        String str=s.toLowerCase();
        int a=0;
        int b=0;
        
        for(int i=0;i<str.length()/2;i++){
            if(isVowel(str.charAt(i))){
                a++;
            }
        }
        
        for(int i=str.length()/2;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                b++;
            }
        }
        
        
        return a==b;
    }
    
    private boolean isVowel(char ch){
        if(ch=='a'||ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}