class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        StringBuilder  sb=new StringBuilder();
        StringBuilder  result=new StringBuilder();
        for(int n:num){
            sb.append(n+"");
        }

        String num1=sb.toString();
        String num2=k+"";

        int i=num1.length()-1;
        int j=num2.length()-1;

        int carry=0;

        while(i>=0 || j>=0 || carry>0){
            int n1=(i>=0)?num1.charAt(i)-'0':0;
            int n2=(j>=0)?num2.charAt(j)-'0':0;

            int sum=n1+n2+carry;
            carry=sum/10;
            result.append(sum%10+"");
            i--;
            j--;
            
        }

        result.reverse();
        List<Integer> list=new ArrayList<>();
        for(char ch:result.toString().toCharArray()){
            list.add(ch-'0');
        }
        return list;
    }
}