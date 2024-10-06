class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        
        for(char a:str1){
            map1.put(a,map1.getOrDefault(a,0)+1);
        }
        
        for(char a:str2){
            map2.put(a,map2.getOrDefault(a,0)+1);
        }
        
        for(Character a:map2.keySet()){
            if(!map1.containsKey(a) || map2.get(a)>map1.get(a)){
                return a;
            }
        }
    
        return ' ';
        
    }
}