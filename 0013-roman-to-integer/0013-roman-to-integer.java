class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            if(val(s.charAt(i))<val(s.charAt(i+1))){
                sum-=val(s.charAt(i));
            }
            else{
                sum+=val(s.charAt(i));
            }
        }
        return sum+val(s.charAt(s.length()-1));
    }
    private int val(char ch){
        if(ch=='I'){
            return 1;
        }
        else if(ch=='V'){
            return 5;
        }
        else if(ch=='X'){
            return 10;
        }
        else if(ch=='L'){
            return 50;
        }
        else if(ch=='C'){
            return 100;
        }
        else if(ch=='D'){
            return 500;
        }
        return 1000;
        
    }
}