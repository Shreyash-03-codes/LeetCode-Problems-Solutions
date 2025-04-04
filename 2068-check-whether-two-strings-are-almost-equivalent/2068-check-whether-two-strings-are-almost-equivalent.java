class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        HashSet<Character> set=new HashSet<>();

        for(char ch:word1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            set.add(ch);
        }

        for(char ch:word2.toCharArray()){
            set.add(ch);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(Character ch:set){
            if(!map2.containsKey(ch) ){
                if(map1.get(ch)>3){
                    return false;
                }
            }

            else if(!map1.containsKey(ch) ){
                if(map2.get(ch)>3){
                    return false;
                }
            }
            else if(Math.abs(map1.get(ch)-map2.get(ch))>3){
                return false;
            }
            

        }
        
        return true;
    }
}