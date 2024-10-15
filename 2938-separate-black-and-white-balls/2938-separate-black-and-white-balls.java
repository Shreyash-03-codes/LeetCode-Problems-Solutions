class Solution {
    public long minimumSteps(String s) {
        
        long count=0;
        int last=0;
        
        int n=s.length();
        
        for(int cur=0;cur<n;cur++){
            if(s.charAt(cur)=='0'){
                count+=(cur-last);
                last++;
                
            }
        }
        
        return count;
    }
}