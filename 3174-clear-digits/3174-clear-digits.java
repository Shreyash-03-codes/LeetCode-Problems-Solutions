class Solution {
    public String clearDigits(String s) {

        StringBuilder str=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                str.deleteCharAt(str.length()-1);
            }
            else{
                str.append(s.charAt(i));
            }

        }

        return str.toString();
        
    }
}