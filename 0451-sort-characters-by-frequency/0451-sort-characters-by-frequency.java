class Solution {
    
    class Pair{
        char ch;
        int freq;
        
        Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String frequencySort(String s) {
        
        
        HashMap<Character,Integer> map=new HashMap<>();
        char[] str=s.toCharArray();
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair a,Pair b){
                return b.freq-a.freq;
            }
        });
        
        for(char ch:str){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(char key:map.keySet()){
            pq.add(new Pair(key,map.get(key)));
        }
        StringBuilder result=new StringBuilder();
        while(!pq.isEmpty()){
            
            Pair p=pq.remove();
            char c=p.ch;
            int n=p.freq;
            
            int i=0;
            while(i<n){
                result.append(c);
                i++;
            }
        }
        return result.toString();
    }
}