class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        
        String[] words=paragraph.toLowerCase().split("[^a-zA-Z]+");
        HashSet<String> set=new HashSet<>();
        for(String w:banned){
            set.add(w);
        }

        HashMap<String,Integer> map=new HashMap<>();

        for(String word:words){
            if(set.contains(word)){
                continue;
            }

            map.put(word,map.getOrDefault(word,0)+1);
        }

        int com=0;
        String st="";
        for(String key:map.keySet()){
            if(com<map.get(key)){
                com=map.get(key);
                st=key;
            }
        }

        return st;

    }
}