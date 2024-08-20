class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] arr=new int[nums.length];
        int k=0,c;
        
        for(int i=0;i<nums.length;i++){
            
             c=0;
            
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    c++;
                }
            }
            arr[k++]=c;
        }
         return arr;
    }
   
}