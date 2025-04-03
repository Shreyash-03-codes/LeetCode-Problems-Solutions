class Solution {
    public int[] sortByBits(int[] arr) {


        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

        for(int e:arr){
            int a=e;
            int aCount=0;
             while(a!=0){
                    if((a&1)==1){
                        aCount++;
                    }
                    a=a>>1;
            }

            if(map.get(aCount)==null){
                map.put(aCount,new ArrayList<>());
            }
            map.get(aCount).add(e);
            
        }



        int i=0;
        for(Integer key:map.keySet()){
            Collections.sort(map.get(key));
            for(Integer k:map.get(key)){
                arr[i++]=k;
            }
        }

        return arr;
    }
}