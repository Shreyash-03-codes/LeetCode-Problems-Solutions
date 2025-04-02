class Solution {
    public int splitNum(int num) {
        String n=num+"";
        int[]arr=new int[n.length()];
        for(int i=0;i<n.length();i++){
            arr[i]=n.charAt(i)-'0';
        }
        Arrays.sort(arr);
        int number1=0;
        int number2=0;

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                number1=number1*10+arr[i];
            }
            else{
                number2=number2*10+arr[i];
            }
        }
        return number1+number2;
        
    }
}