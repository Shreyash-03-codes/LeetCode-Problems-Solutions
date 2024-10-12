class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int i=0,j=n;
        int[] arr=new int[2*n];
        int k=0;
        boolean flag=true;
        while(i<n || j<n*2){
            if(flag){
                arr[k++]=nums[i];
                i++;
                flag=false;
            }
            else{
                arr[k++]=nums[j];
                j++;
                flag=true;
            }
        }
        return arr;
    }
}