class Solution {
    public int[] replaceElements(int[] arr) {
        
        int[] max=new int[arr.length];
        
        for(int i=0;i<arr.length-1;i++){
            int maxi=arr[i+1];
            for(int j=i+1;j<arr.length;j++){
                
                
                if(maxi<arr[j]){
                    maxi=arr[j];
                }
            }
            
            max[i]=maxi;
        }
        max[arr.length-1]=-1;
        return max;
    }
}