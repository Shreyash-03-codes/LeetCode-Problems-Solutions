class Solution {
    public String[] findWords(String[] words) {
        String f="qwertyuiop";
        String s="asdfghjkl";
        String t="zxcvbnm";

        ArrayList<String> list=new ArrayList<>();

        for(String str:words){
            boolean fb=true;
            for(char ch:str.toLowerCase().toCharArray()){
                if(f.indexOf(ch)==-1){
                    fb=false;
                    break;
                }
            }
            boolean sb=true;
            for(char ch:str.toLowerCase().toCharArray()){
                if(s.indexOf(ch)==-1){
                    sb=false;
                    break;
                }
            }
             boolean tb=true;
            for(char ch:str.toLowerCase().toCharArray()){
                if(t.indexOf(ch)==-1){
                    tb=false;
                    break;
                }
            }

            if(fb || sb || tb){
                list.add(str);
            }
            
        }

        words=new String[list.size()];
        int i=0;
        for(String str:list){
            words[i++]=str;
        }
        return words;
    }
}