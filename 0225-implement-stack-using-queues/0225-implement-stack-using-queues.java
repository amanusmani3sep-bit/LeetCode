class MyStack {
    Queue<Integer> q=null;
    public MyStack() {
         q=new ArrayDeque<>();
    }
    
    public void push(int x) {
        q.offer(x);
        int i=0;
        while(i<q.size()-1){
            q.offer(q.peek());
            q.poll();
            i+=1;
        }
    }
    
    public int pop() {
       return q.poll();

    }
    
    public int top() {
       return q.peek();
    }
    
    public boolean empty() {
       return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */