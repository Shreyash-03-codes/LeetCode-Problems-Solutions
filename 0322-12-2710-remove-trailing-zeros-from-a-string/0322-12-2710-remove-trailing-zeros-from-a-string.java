class Solution {
    public String removeTrailingZeros(String num) {
        int i=0;
        while(num.charAt(i)=='0'){
            i++;
        }
        int j=num.length()-1;
        while(num.charAt(j)=='0'){
            j--;
        }
        return num.substring(i,j+1);
    }
}