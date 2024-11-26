class Solution {
    public String customSortString(String order, String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char[] result=new char[s.length()];
        int k=0;
        for(char ch:order.toCharArray()){
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                for(int i=0;i<freq;i++){
                    result[k++]=ch;
                }
                map.remove(ch);
            }
        }
        
        ArrayList<Character> list=new ArrayList<>();
        
        for(Character key:map.keySet()){
            int freq=map.get(key);
            for(int i=0;i<freq;i++){
                list.add(key);
            }
        }
        
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++){
            result[k++]=list.get(i);
        }
        
        return new String(result);
    }
}