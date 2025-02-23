class Solution {
    public int maxVowels(String s, int k) {
        
        int max=Integer.MIN_VALUE;
        String str="aeiouAEIOU";
        int count=0;
        int j=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            if(str.indexOf(s.charAt(i))!=-1){
                count++;
            }
            j++;
            if(j==k){
                max=Math.max(max,count);
                j--;
                if(str.indexOf(s.charAt(left))!=-1){
                    count--;
                }
                left++;
            }
            
        }
        return max;
    }
    
}