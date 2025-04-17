class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,i);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,Math.abs(map.get(ch)-i));
        }
        int sum=0;
        for(Character ch:map.keySet()){
            sum+=map.get(ch);
        }
        return sum;
        
    }
}