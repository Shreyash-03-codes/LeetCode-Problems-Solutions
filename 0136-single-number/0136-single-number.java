class Solution {
    int num=0;
    public int singleNumber(int[] nums) {

        int one=0;
        for(int i=0;i<nums.length;i++){

            one=one^nums[i];

        }

        return one;

    }
}