class Solution {
    public int largestAltitude(int[] gain) {
     
        int n=gain.length;
        
        int[] altitude=new int[n+1];
        
        altitude[0]=0;
        
        for(int i=0;i<n;i++){
            altitude[i+1]=altitude[i]+gain[i];
        }
        
        int max=Integer.MIN_VALUE;
        
        for(int a:altitude){
            if(a>max){
                max=a;
            }
        }
        return max;
    }
}