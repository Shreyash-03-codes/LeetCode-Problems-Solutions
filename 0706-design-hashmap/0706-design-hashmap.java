class MyHashMap {
    
    int[] hash;
    

    public MyHashMap() {
        hash=new int[1000001];
        Arrays.fill(hash,-1);
    }
    
    public void put(int key, int value) {
        
        hash[key]=value;
    }
    
    public int get(int key) {
        return hash[key];
    }
    
    public void remove(int key) {
        hash[key]=-1;
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */