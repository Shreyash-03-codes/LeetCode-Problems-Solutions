class Solution {
    public boolean isGood(int[] nums) {
        
        Arrays.sort(nums);
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int max=Integer.MIN_VALUE;
        
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
            if(max<a){
                max=a;
            }
        }
        
        boolean flag=true;
        
        for(Integer key:map.keySet()){
            if(key==nums.length-1){
                continue;
            }
            
            else if(map.get(key)>1){
                flag=false;
            }
        }
        
        
        if(!map.containsKey(nums.length-1)){
            return false;
        }
        if(map.get(max)==2 && flag){
            return true;
        }
        else{
            return false;
        }
    }
}