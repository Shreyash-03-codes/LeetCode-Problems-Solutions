class Solution {
    public long[] sumOfThree(long num) {
        
        
        long n=num/3;
        long sum=(n-1)+n+(n+1);
        if(sum==num){
            return new long[]{n-1,n,n+1};
        }
        
        return new long[0];
    }
}