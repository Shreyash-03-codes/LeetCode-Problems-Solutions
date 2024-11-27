class Solution {
    
    public class Pair{
        String str;
        int len;
        int ind;
        Pair(String str,int len,int ind){
            this.str=str;
            this.len=len;
            this.ind=ind;
        }
    }
    
    public String arrangeWords(String text) {
        
 
        
        String[] words=text.toLowerCase().split(" ");
        ArrayList<Pair> pq=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            pq.add(new Pair(words[i],words[i].length(),i));
        }
        
        StringBuilder result=new StringBuilder();
        Collections.sort(pq,new Comparator<Pair>(){
           public int compare(Pair a,Pair b) {
               if(a.len!=b.len){
                   return a.len-b.len;
               }
               return a.ind-b.ind;
           }
        });
        for(Pair p:pq){
            result.append(p.str).append(" ");
        }
        
        String arrange=result.toString().trim();
        
        return arrange.substring(0,1).toUpperCase()+arrange.substring(1);
    }
}