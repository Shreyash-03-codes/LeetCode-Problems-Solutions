class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String n=String.valueOf(num);
        int count=0;
        
        for(int i=0;i<=n.length()-k;i++){
            
            String sub=n.substring(i,i+k);
            
            int div=Integer.valueOf(sub);
            
            if (div==0){
                continue;
            }
            if(num%div==0){
                count++;
            }
            
        }
        
        return count;
    }
}