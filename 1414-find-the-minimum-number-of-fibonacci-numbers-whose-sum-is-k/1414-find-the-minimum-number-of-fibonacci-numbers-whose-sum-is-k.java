class Solution {
    public int findMinFibonacciNumbers(int k) {
        
        TreeSet<Integer> set=new TreeSet<>();
        int n1=0;
        int n2=1;
        int n3=1;
        while(n3<=k){
            n3=n1+n2;
            set.add(n3);
            n1=n2;
            n2=n3;
        }
        int count=0;
        while(k!=0 && !set.isEmpty()){
            if(set.contains(k)){
                count++;
                k-=k;
            }
            else{
                int large=set.pollLast();
                if(large<=k){
                    k-=large;
                    count++;
                }
            }
            
        }
        return count;
    }
}