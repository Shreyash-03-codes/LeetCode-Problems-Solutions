class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] result=new int[nums.length-k+1];
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int left=0;
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        for(int e:nums){
            i++;
            map.put(e,map.getOrDefault(e,0)+1);
            max=Math.max(max,e);
            if(i==k){
                result[j++]=max;
                i--;
                if(map.containsKey(nums[left])){
                    if(map.get(nums[left])==1){
                        map.remove(nums[left]);
                    }
                    else{
                        map.put(nums[left],map.get(nums[left])-1);
                    }
                }

                if(!map.isEmpty()){
                    max=map.lastKey();
                }
                else{
                    max=Integer.MIN_VALUE;
                }
                left++;
            }
        }
        return result;
       
    }
}