class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(String s:strs){
            
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        for(List<String> list:map.values()){
            result.add(list);
        }
        
        return result;
    }
}