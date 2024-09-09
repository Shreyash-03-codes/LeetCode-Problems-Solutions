class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
        
        
        StringBuilder sc=new StringBuilder();
        
        for(int i=0;i<words.length;i++){
           
            sc.append(words[i]);
            
            if(   s.equals(sc.toString())){
        
                    return true;
             }
        }
       
        return false;
        
  
        
    }
}