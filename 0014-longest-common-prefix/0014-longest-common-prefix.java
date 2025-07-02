class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        String ans="";
        for(String s:strs){
            min=Math.min(min,s.length());
        }
        for(int i=1;i<=min;i++){
            String sub=strs[0].substring(0,i);
            boolean flag=true;
            for(String s:strs){
                if(!s.startsWith(sub)){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            else{
                ans=sub;
            }
        }
        return ans;
    }
}