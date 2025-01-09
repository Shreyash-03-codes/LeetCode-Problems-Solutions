class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list=new ArrayList<>();
        char[] sti=p.toCharArray();
        Arrays.sort(sti);
        String pt=new String(sti);
        int n=s.length();
        int m=p.length();
        
        for(int i=0;i<=n-m;i++){
            
            String str=s.substring(i,i+m);
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(pt.equals(st)){
                list.add(i);
            }
        }
        return list;
    }
}