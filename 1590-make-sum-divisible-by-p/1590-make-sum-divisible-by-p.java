class Solution {
    public int minSubarray(int[] nums, int p) {
        
        int length=nums.length;
        int totalSum=0;
        
        for(int a:nums){
            totalSum=(totalSum+a)%p;
        }
        
        int target=totalSum%p;
        if(target==0){
            return 0;
        }
        
        int curSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int minLength=length;
        
        for(int i=0;i<nums.length;i++){
            curSum=(curSum+nums[i])%p;
            int needed=(curSum-target+p)%p;
            
            if(map.containsKey(needed)){
                minLength=Math.min(minLength,i-map.get(needed));
            }
            
            map.put(curSum,i);
        }
        
        if(minLength==length){
            return -1;
        }
        
        return minLength;
        
    }
}