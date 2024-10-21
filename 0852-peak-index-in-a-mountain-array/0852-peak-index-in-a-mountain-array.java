class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int last=arr.length-1;
        
        while(start<=last){
            
            int mid=(start+last)/2;
             if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            
            else if(arr[mid]>arr[mid+1]){
                last=mid-1;
            }
            
            else if(arr[mid]<arr[mid+1] ){
                start=mid+1;
            }
            
        }
        
        return -1;
    }
}