class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        int n=sentence.length();
        int m=searchWord.length();
        
        if(n<m){
            return -1;
        }
        
        String[] words=sentence.split(" ");
        
        for(int i=0;i<words.length;i++){
            
            String s=words[i];
            
            if(s.length()<m){
                continue;
            }
            int j=0;
            for(j=0;j<m;j++){
                if(s.charAt(j)!=searchWord.charAt(j)){
                    break;
                }
            }
            
            if(j==m){
                return i+1;
            }
        }
        return -1;
    }
}