class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String[] words=sentences[i].split("\\W");
            if(max<words.length){
                max=words.length;
            }
        }
        return max;
    }
}