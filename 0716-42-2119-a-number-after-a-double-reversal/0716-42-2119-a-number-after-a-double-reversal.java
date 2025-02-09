class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=reverse(num);
        int rev2=reverse(rev1);

        return num==rev2;
    }

    private int reverse(int num){
        int n=0;
        while(num!=0){
            int rem=num%10;
            n=n*10+rem;
            num/=10;
        }
        return n;
    }
}