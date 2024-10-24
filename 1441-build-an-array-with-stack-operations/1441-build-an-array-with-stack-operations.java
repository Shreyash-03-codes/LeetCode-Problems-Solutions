class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<target.length;i++){
            list.add(target[i]);
        }
        
        ArrayList<String> result=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        
        int i=1;
        int c=0;
        
        while(i<=n){
            stack.push(i);
            result.add("Push");
            c++;
            if(!list.contains(i)){
                stack.pop();
                result.add("Pop");
                c--;
            }
            i++;
            if(c==target.length){
                break;
            }
        }
        
        return result;
            
    }
}