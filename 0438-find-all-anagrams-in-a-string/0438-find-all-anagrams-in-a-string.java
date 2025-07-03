class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        char[]c=p.toCharArray();
        Arrays.sort(c);
         p=new String(c);
        for(int i=0;i<=s.length()-p.length();i++){
            char[]ch=s.substring(i,i+p.length()).toCharArray();
            Arrays.sort(ch);
            String sub=new String(ch);
            if(sub.equals(p)){
                list.add(i);
            }
        }
        return list;
    }
}