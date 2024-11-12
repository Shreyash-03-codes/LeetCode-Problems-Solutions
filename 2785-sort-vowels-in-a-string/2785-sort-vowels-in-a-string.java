class Solution {
    public String sortVowels(String s) {
        
        ArrayList<Character> list=new ArrayList<>();
        
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                list.add(ch);
            }
        }
        
        Collections.sort(list);
        
        char[] str=new char[s.length()];
        int i=0;
        int j=0;
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                str[j]=list.get(i);
                i++;
                j++;
            }
            else{
                str[j]=ch;
                j++;
            }
        }
        
        return new String(str);
    }
}