class Solution {
    public long dividePlayers(int[] skill) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int n=skill.length;
        int teams=n/2;
        
        int totalSum=0;
    
        for(int a:skill){
            map.put(a,map.getOrDefault(a,0)+1);
            totalSum+=a;
        }
        
        if(totalSum%teams!=0){
            return -1;
        }
  
        int targetPoint=totalSum/teams;
        long result=0;
        
        for(int element:skill){
            if(map.get(element)==0){
                continue;
            }
            
            map.put(element,map.get(element)-1);
            int partner=targetPoint-element;
            
            if(!map.containsKey(partner) || map.get(partner)==0){
                return -1;
            }
            
            map.put(partner,map.get(partner)-1);
            
            result=result+((long)element*(long)partner);
            
        }
        
        return result;
    }
}