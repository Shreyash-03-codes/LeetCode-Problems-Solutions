class Solution {
    public boolean checkIfExist(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            
                for(int k=0;k<arr.length;k++){
                    
                    if(i==k){
                        continue;
                    }
                  
                    if(arr[i]==2*arr[k]){
                        return true;
                    }
                }
            }
        
        
        return false;
        
    }
}