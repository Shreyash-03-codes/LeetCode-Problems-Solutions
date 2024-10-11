class Solution {
    
    private boolean isSingle(int num){
        String s=Integer.toString(num);
        return s.length()==1;
    }
    public boolean canAliceWin(int[] nums) {
        
        int single=0;
        int doubled=0;
        
        for(int a:nums){
            if(isSingle(a)){
                single+=a;
            }
            else{
                doubled+=a;
            }
        }
        
        return single==doubled?false:true;
    }
}