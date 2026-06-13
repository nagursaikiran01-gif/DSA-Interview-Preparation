class LRUCache {
    int capacity;
    int l=0;
    int r=0;
    ArrayList<int[]> cache;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache=new ArrayList<>();
    }
    
    public int get(int key) {
        for(int i=0;i<cache.size();i++){
            if(cache.get(i)[0]==key){
                int v=cache.get(i)[1];
                cache.remove(i);
                cache.add(0,new int[]{key,v});
                return v;
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        for(int i=0;i<cache.size();i++){
            if(cache.get(i)[0]==key){
                cache.remove(i);
                cache.add(0,new int[]{key,value});
                return;
            }
        }
        if(cache.size()>=capacity){
            cache.remove(cache.size()-1);
        }
        cache.add(0,new int[]{key,value});
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */