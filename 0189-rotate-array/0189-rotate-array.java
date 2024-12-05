class Solution {
    public void rotate(int[] nums, int k) {
        
       
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        k=k%n;
        for(int i=n-k;i<n;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<n-k;i++){
            list.add(nums[i]);
        }
        int i=0;
        for(Integer e:list){
            nums[i++]=e;
        }
        
    }
}