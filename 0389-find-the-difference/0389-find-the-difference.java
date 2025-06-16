class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> sMap=new HashMap<>();
        HashMap<Character,Integer> tMap=new HashMap<>();

        for(char ch:s.toCharArray()){
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);
        }

        for(char ch:t.toCharArray()){
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }

        for(char ch:tMap.keySet()){
            if(!sMap.containsKey(ch)){
                return ch;
            }
            if(sMap.get(ch)!=tMap.get(ch)){
                return ch;
            }
        }
        return ' ';
        
    }
}