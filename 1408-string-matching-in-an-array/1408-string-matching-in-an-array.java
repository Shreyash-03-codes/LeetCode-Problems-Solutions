class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> result=new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            
            String t=words[i];
            
            for(int j=0;j<words.length;j++){
                
                String p=words[j];
                
                if(i==j || t.length()>p.length()){
                    continue;
                }
                
                for(int k=0;k<=p.length()-t.length();k++){
                    
                    int l=0;
                    
                    for(l=0;l<t.length();l++){
                        if(p.charAt(k+l)!=t.charAt(l)){
                            break;
                        }
                    }
                    
                    if(l==t.length() && !result.contains(t)){
                        result.add(t);
                    }
                }
                
                  
            }
            
        }
        return result;
    }
}