class Solution {
    public int[] evenOddBit(int n) {

    
        int odd=0;
        int even=0;

        int number=1;
        while(n>0){
            if(number%2==1){
                if((n&1)==1){
                    odd++;
                }
            }
            else{
                if((n&1)==1){
                    even++;
                }
            }
            number++;
            n=n>>1;
        }
      
        return new int[]{odd,even};
        
    }
}