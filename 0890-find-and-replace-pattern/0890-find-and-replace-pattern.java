class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list=new ArrayList<>();
        for(String s:words){
            if(s.length()!=pattern.length()){
                continue;
            }
            HashMap<Character,Character> map1=new HashMap<>();
            HashMap<Character,Character> map2=new HashMap<>();
            boolean flag=true;
            for(int i=0;i<s.length();i++){
                char ch1=pattern.charAt(i);
                char ch2=s.charAt(i);
                
                if(!map1.containsKey(ch1)){
                    map1.put(ch1,ch2);
                }
                else if(map1.get(ch1)!=ch2){
                    flag=false;
                    break;
                }

                 if(!map2.containsKey(ch2)){
                    map2.put(ch2,ch1);
                }
                else if(map2.get(ch2)!=ch1){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(s);
            }
        }
        return list;
    }
}