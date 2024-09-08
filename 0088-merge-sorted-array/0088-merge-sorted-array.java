class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
  
        int i=0;
        int j=0;
        int k=0;
        
        int[] mix=new int[n+m];
        
        while(i<m && j<n){
            
            if(nums1[i]<nums2[j]){
                mix[k++]=nums1[i++];
            }
            else{
                mix[k++]=nums2[j++];
            }
        }
        
        while(i<m){
            mix[k++]=nums1[i++];
        }
        while(j<n){
            mix[k++]=nums2[j++];
        }
        
        for(i=0;i<mix.length;i++){
            nums1[i]=mix[i];
        }
        
    }
}