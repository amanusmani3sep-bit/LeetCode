class MinStack {
    Stack<Integer> s=null;
    Stack<Integer> min=null;
    
    public MinStack() {
        s=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int value) {
        if(min.isEmpty()){
            min.push(value);
        }
        else if(min.peek()>=value){
            min.push(value);
        }
        s.push(value);
    }
    
    public void pop() {
        int m=s.pop();
        if(min.peek()==m){
            min.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        if(!min.isEmpty()){
           return min.peek();
           
        }
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */