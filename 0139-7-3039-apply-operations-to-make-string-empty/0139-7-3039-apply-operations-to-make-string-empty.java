class Solution {
    public String lastNonEmptyString(String s) {
        

        HashMap<Character,Integer> map=new HashMap<>();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=s.length()-1;i>=0;i--){
            set.add(s.charAt(i));
           
        }

        int max=Integer.MIN_VALUE;

        for(Character ch:map.keySet()){
            if(max<map.get(ch)){
                max=map.get(ch);
            }
        }

        StringBuilder sb=new StringBuilder();

        for(Character ch:set){
            if(map.get(ch)==max){
                sb.insert(0,ch);
            }
        }

        return sb.toString();
    }
}