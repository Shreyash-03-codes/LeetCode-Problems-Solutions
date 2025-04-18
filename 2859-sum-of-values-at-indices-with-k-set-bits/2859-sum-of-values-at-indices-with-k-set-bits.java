class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(k==getBits(i)){
                sum+=nums.get(i);
            }
        }
        return sum;
    }

    private int getBits(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}