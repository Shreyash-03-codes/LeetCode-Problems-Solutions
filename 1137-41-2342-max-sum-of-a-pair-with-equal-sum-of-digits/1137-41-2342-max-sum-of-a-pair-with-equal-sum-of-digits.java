class Solution {
    public int maximumSum(int[] nums) {
        
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();

        for(int a:nums){
            int sum=getSum(a);
            if(map.get(sum)==null){
                map.put(sum,new PriorityQueue<>(new Comparator<Integer>(){
                    public int compare(Integer a,Integer b){
                        return b-a;
                    }
                }));
            }
            map.get(sum).add(a);
        }
        int max=Integer.MIN_VALUE;

        for(Integer key:map.keySet()){
            if(map.get(key).size()>=2){
                int n1=map.get(key).remove();
                int n2=map.get(key).remove();

                int sum=n1+n2;

                max=Math.max(sum,max);
                
            }
        }

        return max==Integer.MIN_VALUE?-1:max;
    }

    private int getSum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}