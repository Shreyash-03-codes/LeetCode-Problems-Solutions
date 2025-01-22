class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq=new PriorityQueue<>(new Comparator<String>(){
            public int compare(String s1,String s2){
                if(s1.length()==s2.length()){

                    for(int i=0;i<s1.length();i++){
                        char c1=s1.charAt(i);
                        char c2=s2.charAt(i);
                        
                        if(c1==c2){
                            continue;
                        }

                        if(c1<c2){
                            return 1;
                        }
                        if(c1>c2){
                            return -1;
                        }
                        
                    }
                    return 0;

                }

                return s2.length()-s1.length();
            }
        });

        for(String st:nums){
            pq.add(st);
        }

        while(!pq.isEmpty() && k!=0){
            String st=pq.remove();
            k--;
            if(k==0){
                return st;
            }
        }
        return "";
    }
}