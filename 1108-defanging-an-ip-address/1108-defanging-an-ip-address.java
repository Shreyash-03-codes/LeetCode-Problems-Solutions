class Solution {
    public String defangIPaddr(String address) {
        
        String[] num=address.split("\\.");
        StringBuilder sb=new StringBuilder();
        for(String n:num){
            if(sb.length()==0){
                sb.append(n);
            }
            else{
                sb.append("[.]").append(n);
            }
        }
        return sb.toString();
    }
}