class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int var=0;
        
        for(String a:operations){
            if(a.equals("++X")){
               ++var;
            }
            else if(a.equals("X++")){
                var++;
            }
            else if(a.equals("--X")){
                --var;
            }
            else if(a.equals("X--")){
                var--;
            }
        
        }
        return var;
                    
    }
}