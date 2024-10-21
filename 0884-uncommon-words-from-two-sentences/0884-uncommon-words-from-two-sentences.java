class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");
        
        ArrayList<String> list=new ArrayList<>();
        
        HashMap<String,Integer> map=new HashMap<>();
        
        for(String s:str1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:str2){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        for(String key:map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        
        String[] words=new String[list.size()];
        int i=0;
        for(String s:list){
            words[i++]=s;
        }
        
        return words;
        
    }
}