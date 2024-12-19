class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
            
                int start=j+1;
                int last=n-1;
                
                while(start<last){
                    long sum=nums[i]+nums[j];
                    sum+=nums[start]+nums[last];
                    
                    if(sum==target){
                        ArrayList<Integer> list=new ArrayList<>();
                        
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[last]);
                        
                        result.add(list);
                        
                        start++;
                        last--;
                        
                        while(start<last && nums[start]==nums[start-1]){
                            start++;
                        }
                        
                        while(start<last && nums[last]==nums[last+1]){
                            last--;
                        }
                        
                        
                    }
                    
                    else if(sum<target){
                        start++;
                    }
                    else if(sum>target){
                        last--;
                    }
                    
                }
            }
        }
        return result;
        
    }
}