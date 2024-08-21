class Solution {
    public int[] numberGame(int[] nums) {
        
        int[] arr=new int[nums.length];
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int i,j,k=0;
        for(i=0,j=i+1;j<nums.length;j++){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            
            i=i+2;
            j=j+1;
        }
        
        for(i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        
        return arr;
    }
}