class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        int t=-1;
        if(s1.isEmpty()){
            return -1;
        }
        else{
            int n=s1.size();
            for(int i=0;i<n;i++){
                int temp=s1.pop();
                s2.push(temp);
            }
            t=s2.pop();
            int n1=s2.size();
            for(int i=0;i<n1;i++){
                s1.push(s2.pop());
            }
        }
        return t;
        
    }
    
    public int peek() {
        int t=-1;
        if(s1.isEmpty()){
            return -1;
        }
        else{
            int n=s1.size();
            for(int i=0;i<n;i++){
                int temp=s1.pop();
                s2.push(temp);
            }
            t=s2.peek();
            int n1=s2.size();
            for(int i=0;i<n1;i++){
                s1.push(s2.pop());
            }
        }
        return t;
        
    }
    
    public boolean empty() {
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */