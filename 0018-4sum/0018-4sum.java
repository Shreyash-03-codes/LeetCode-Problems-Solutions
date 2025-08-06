class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int s=j+1;
                int l=nums.length-1;
                while(s<l){
                    long sum=nums[i]+nums[j];
                    sum+=nums[s]+nums[l];
                    if(sum==target){
                        List<Integer> li=Arrays.asList(nums[i],nums[j],nums[s],nums[l]);
                        if(!set.contains(li)){
                            set.add(li);
                            list.add(li);
                          
                        }
                        s++;
                        l--;
                       
                    }
                     else if(sum<target){
                            s++;
                        }
                        else{
                            l--;
                        }
                }
            }
        }
        return list;
    }
}