class Solution {
    public boolean digitCount(String num) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<num.length();i++){
            map.put(num.charAt(i)-'0',map.getOrDefault(num.charAt(i)-'0',0)+1);
        }
        int c=0;
        
        boolean flag=true;
        for(int i=0;i<num.length();i++){
            
            if(map.containsKey(i)){
                c=map.get(i);
            }
            else{
                c=0;
            }
            
            if(num.charAt(i)-'0'!=c){
                flag=false;
            }
        }
        return flag;
    }
}