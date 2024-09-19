class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<jewels.length();i++){
            map.put(jewels.charAt(i),map.getOrDefault(jewels.charAt(i),0)+1);
        }
        
        int count=0;
        
        for(int i=0;i<stones.length();i++){
            if(map.containsKey(stones.charAt(i))){
                count++;
            }
        }
        
        return count;
    }
}