class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        boolean flip=false;
        boolean skip=false;
        List<Integer> list=new ArrayList<>();

        for(int[]nums:grid){
            if(flip){
                for(int i=nums.length-1;i>=0;i--){
                    if(skip){
                        skip=!skip;
                        continue;
                    }
                    list.add(nums[i]);
                    skip=!skip;
                }
            }
            else{
                for(int i=0;i<nums.length;i++){
                    if(skip){
                        skip=!skip;
                        continue;
                    }
                    list.add(nums[i]);
                    skip=!skip;
                }
            }
            flip=!flip;
        }
        return list;
        
        
    }
}