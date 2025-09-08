class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n;i++){
            int num=n-i;
            if(!(num+"").contains("0") && !(i+"").contains("0")){
                return new int[]{i,num};
            }
        }
        return new int[]{};
    }
}