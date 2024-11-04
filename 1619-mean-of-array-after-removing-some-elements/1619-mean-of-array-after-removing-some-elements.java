class Solution {
    public double trimMean(int[] arr) {
        
        Arrays.sort(arr);
        
        int per=(arr.length*5)/100;
        
         double result=0;
        int k=0;
        int small=per;
        int large=per;
        
        for(int i=per;i<arr.length-per;i++){
           
            
            result+=arr[i];
        }
        
        return result/(arr.length-(per*2));
    }
}