class Solution {
    public int maxProduct(String[] words) {
        
        int pro=0;
     
        for(int i=0;i<words.length;i++){
            HashSet<Character> set=new HashSet<>();
            for(char ch:words[i].toCharArray()){
                set.add(ch);
            }
            
            for(int j=i+1;j<words.length;j++){
             

                boolean flag=true;
                for(char ch:words[j].toCharArray()){
                    if(set.contains(ch)){
                        flag=false;
                        break;
                    }
                }

            
                if(flag){
                    int p=words[i].length()*words[j].length();
                    pro=Math.max(pro,p);
                }
            }
            

        }
        return pro;
    }
}