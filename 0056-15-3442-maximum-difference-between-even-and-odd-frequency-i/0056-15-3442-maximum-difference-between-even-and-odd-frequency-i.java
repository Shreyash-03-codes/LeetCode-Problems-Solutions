class Solution {
    public int maxDifference(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(char ch:s.toCharArray()){   
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> eve=new ArrayList<>();
        for(Character key:map.keySet()){
            if(map.get(key)%2==0){
                eve.add(map.get(key));
            }
            else{
                odd.add(map.get(key));
            }
        }
        Collections.sort(eve);
        Collections.sort(odd);

        int d= odd.get(odd.size()-1)-eve.get(0);
        return d;
        
        

    }
}