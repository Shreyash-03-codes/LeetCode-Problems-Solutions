class Solution {
    public int[] findOriginalArray(int[] changed) {


       if(changed.length%2!=0){
        return new int []{};
       }

       HashMap<Integer,Integer> map=new HashMap<>();
       int[] arr=new int[changed.length/2];
       int i=0;
         Arrays.sort(changed);

       for(int e:changed){
            map.put(e,map.getOrDefault(e,0)+1);
       }

     

       for(int n:changed){
        if(map.get(n)==0){
            continue;
        }

        if(map.getOrDefault(n*2,0)==0){
            return new int[]{};
        }
        if(i>=arr.length){
           return new int[]{};
        }
        arr[i++]=n;

        map.put(n,map.get(n)-1);
        map.put(n*2,map.get(n*2)-1);
        
       }    
       return arr;    
    }
}