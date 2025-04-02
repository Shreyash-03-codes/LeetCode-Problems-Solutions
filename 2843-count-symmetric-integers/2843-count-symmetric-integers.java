class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int count=0;
        for(int i=low;i<=high;i++){
            String dig=i+"";
            if(symetric(i) && dig.length()%2==0){
                count++;
            }
        }
        return count;
    }

    private boolean symetric(int n){
        String num=n+"";
        int i=0;
        int left=0;
        while(i<(num.length()/2)){
            int x=num.charAt(i)-'0';
            left+=x;
            i++;
        }
        int right=0;
        while(i<num.length()){
            int x=num.charAt(i)-'0';
            right+=x;
            i++;
        }
        return left==right;
        
    }
}