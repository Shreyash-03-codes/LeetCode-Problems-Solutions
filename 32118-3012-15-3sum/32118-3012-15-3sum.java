class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);

        int n=nums.length;

        for(int i=0;i<n-2;i++){
            int start=i+1;
            int last=n-1;

            while(start<last){
                int sum=nums[i]+nums[start]+nums[last];

                if(sum==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[last]);

                    if(!set.contains(list)){
                        result.add(list);
                        set.add(list);
                    }
                    start++;
                    last--;
                }
                else if(sum<0){
                    start++;
                }
                else{
                    last--;
                }
            }
        }
        return result;
    }
}