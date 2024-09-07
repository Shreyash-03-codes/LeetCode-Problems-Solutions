class Solution {
    public int countPrefixes(String[] words, String s) {
        int i=0;
        for(String str:words){
            if(s.startsWith(str)){
                i++;
            }
        }
        return i;
    }
}