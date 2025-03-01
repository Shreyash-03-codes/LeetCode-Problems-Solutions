class Solution {
    public int minimumSum(int num) {
        String n=num+"";
        char[]ch=n.toCharArray();
        Arrays.sort(ch)  ;
        int num1=(ch[0]-'0')*10+(ch[2]-'0');
        int num2=(ch[1]-'0')*10+(ch[3]-'0');
        return num1+num2;
           
    }
}