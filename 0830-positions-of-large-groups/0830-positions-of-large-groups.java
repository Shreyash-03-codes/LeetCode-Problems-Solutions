class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int start=0;
        int last=0;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                last++;
            }
            else{
                if(last-start>=2){
                    List<Integer> l=new ArrayList<>();
                    l.add(start);
                    l.add(last);
                    list.add(l);
                    
                }
                start=i;
                last=i;
            }
        }
        if(last-start>=2){
            List<Integer> l=new ArrayList<>();
            l.add(start);
            l.add(last);
            list.add(l);
        }
        return list;
    }
}