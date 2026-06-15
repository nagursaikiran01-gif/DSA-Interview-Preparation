class node{
    int key;
    int value;
    node prev;
    node next;
    node(int key,int value){
        this.key=key;
        this.value=value;
        prev=null;
        next=null;
    }
}
class LRUCache {
    /*
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
    */

    int capacity;
    int l=0;
    node head=null;
    node tail=null;
    HashMap<Integer,node> m1;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        m1=new HashMap<>();
    }
    
    public int get(int key) {
        if(m1.containsKey(key)){
            node temp=m1.get(key);
            if(temp.prev==null){
                head=temp;
                return temp.value;
            }
            if(temp.next!=null && temp.prev!=null){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;

                temp.next=head;
                head.prev=temp;
                head=temp;
                head.prev=null;
            }
            else{
                if(temp.next==null){
                    tail=temp.prev;
                    temp.next=head;
                    temp.prev.next=null;
                    temp.prev=null;
                    head.prev=temp;
                    head=temp;
                }
            }
            return m1.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(m1.containsKey(key)){
            node temp=m1.get(key);
            temp.value=value;
            if(temp.prev==null){
                return;
            }
            if(temp.next!=null && temp.prev!=null){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;

                temp.next=head;
                head.prev=temp;
                temp.prev=null;
                head=temp;
            }
            else{
                if(temp.next==null){
                    tail=temp.prev;
                    temp.next=head;
                    temp.prev.next=null;
                    temp.prev=null;
                    head.prev=temp;
                    head=temp;
                }
            }     
        }
        else{
            if(l<capacity){
                l++;
                node n1=new node(key,value);
                m1.put(key,n1);
                if(head==null){
                    head=n1;
                    tail=n1;
                }
                else{
                    n1.next=head;
                    head.prev=n1;
                    head=n1;
                }
            }
            else{
                node n1=new node(key,value);
                m1.remove(tail.key);
                if(capacity==1){
                    head=n1;
                    tail=n1;
                    m1.put(key,n1);
                    return;
                }
                if(capacity>1){
                    tail=tail.prev;
                    tail.next=null;
                }
                m1.put(key,n1);
                n1.next=head;
                head.prev=n1;
                head=n1;
                
            }
        }
    }
}


//O(1)-time
//O(1)-space


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */