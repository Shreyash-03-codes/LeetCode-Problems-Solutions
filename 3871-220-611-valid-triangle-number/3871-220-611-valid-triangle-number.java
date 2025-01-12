class Solution {
    public int triangleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;

        for(int i=n-1;i>1;i--){
            int start=0;
            int last=i-1;
            while(start<last){
                int sum=nums[start]+nums[last];

                if(sum>nums[i]){
                    count+=(last-start);
                    last--;
                }
                else{
                    start++;
                }
            }
        }
        return count;
    }
}