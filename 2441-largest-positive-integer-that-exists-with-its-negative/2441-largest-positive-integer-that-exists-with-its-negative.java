class Solution {
    public int findMaxK(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int a:nums){
            set.add(a);
        }
        
        int large=-1;
        
        for(int a:nums){
            if(set.contains(a) && set.contains(-a)){
                if(large<Math.abs(a)){
                    large=Math.abs(a);
                }
            }
        }
        
        return large;
    }
}