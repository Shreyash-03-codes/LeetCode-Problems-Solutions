class Solution {
    public int smallestNumber(int n) {
        int num=0;
        int p=1;
        while(n!=0){
            if((n&1)==0){
                num+=p;
            }
            else{
                num+=p;
            }
            p=p*2;
            n=n>>1;
        }
        return num;
    }
}