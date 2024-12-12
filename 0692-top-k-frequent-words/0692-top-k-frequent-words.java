class Solution {
    class Pair{
        int num;
        String st;
        
        Pair(int n,String s){
            this.num=n;
            this.st=s;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair p,Pair q){
                if(p.num!=q.num){
                    return q.num-p.num;
                }
                
                return p.st.compareTo(q.st);
            }
        });
        
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        for(String key:map.keySet()){
            pq.add(new Pair(map.get(key),key));
        }
        
        List<String> list=new ArrayList<>();
        
        while(k!=0){
            list.add(pq.remove().st);
            k--;
        }
        return list;
    }
}