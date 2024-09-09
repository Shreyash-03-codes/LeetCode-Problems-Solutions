class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length);
        return nums;
    }
    
    public void mergeSort(int[] nums,int start,int last){
        if(last-start==1){
            return;
        }
        
        int mid=(start+last)/2;
        
        mergeSort(nums,start,mid);
        mergeSort(nums,mid,last);
        
        merge(nums,start,mid,last);
    }
    
    public void merge(int[] nums,int start,int mid,int last){
        
        int i=start;
        int j=mid;
        int k=0;
        
        int[] mix=new int[last-start];
        
        while(i<mid && j<last){
            if(nums[i]<nums[j]){
                mix[k++]=nums[i++];
            }
            else{
                mix[k++]=nums[j++];
            }
        }
        
        while(i<mid){
            mix[k++]=nums[i++];
        }
        
        while(j<last){
            mix[k++]=nums[j++];
        }
        
        for(i=0;i<mix.length;i++){
            nums[start+i]=mix[i];
        }
    }
}