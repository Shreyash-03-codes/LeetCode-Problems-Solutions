class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int prev=n&1;
        n=n>>1;
        while(n!=0){
            int p=n&1;
            if(p==prev){
                return false;
            }
            else{
                prev=p;
            }
            n=n>>1;
        }
        return true;
    }
}