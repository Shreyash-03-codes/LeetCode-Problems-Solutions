class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        char[]str=blocks.toCharArray();
        int left=0;

        for(char ch:str){
            i++;
            if(ch=='W'){
                count++;
            }
            if(i==k){
                min=Math.min(min,count);
                i--;
                if(str[left]=='W'){
                    count--;
                }
                left++;

            }
        }
        return min;
    }
}