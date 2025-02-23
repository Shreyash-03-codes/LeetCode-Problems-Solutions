class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        long max=0;
        int left=0;
        long sum=0;
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            j++;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(j==k){
                
                if(map.size()==k){
                    max=Math.max(sum,max);
                }
                if(map.containsKey(nums[left])){
                    if(map.get(nums[left])==1){
                    map.remove(nums[left]);
                    }
                    else{
                        map.put(nums[left],map.get(nums[left])-1);

                    }
                }
       
               sum-=nums[left];
               
               left++;
               j--;
             

            }

        }
        return max;
        
    }
}