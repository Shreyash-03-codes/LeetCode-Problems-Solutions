class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ran=new HashMap<>();
        HashMap<Character,Integer> mag=new HashMap<>();

        for(char ch:ransomNote.toCharArray()){
            ran.put(ch,ran.getOrDefault(ch,0)+1);
        }

        for(char ch:magazine.toCharArray()){
            mag.put(ch,mag.getOrDefault(ch,0)+1);
        }

        for(Character ch:ran.keySet()){
            if(!mag.containsKey(ch) || ran.get(ch)>mag.get(ch)){
                return false;
            }
        }
        return true;
        
    }
}