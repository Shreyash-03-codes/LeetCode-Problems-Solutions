class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        char[] letters=s.toCharArray();
        
        StringBuilder sb=new StringBuilder();
        
        int i=0;
        int j=0;
        while(i<s.length()){
            if(j<spaces.length && i==spaces[j]){
                
                sb.append(" ").append(letters[i]);
                i++;
                j++;
                continue;
            }
            else{
                sb.append(letters[i]);
                i++;
            }
        }
        return sb.toString();
    }
}