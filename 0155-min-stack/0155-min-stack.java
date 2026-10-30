class MinStack {
    long min=Long.MAX_VALUE;
    Stack<Long> s=null;
    // Stack<Integer> min=null;
    
    public MinStack() {
        s=new Stack<>();

        // min=new Stack<>();
    }
    
    public void push(int value) {
        // if(min.isEmpty()){
        //     min.push(value);
        // }
        // else if(min.peek()>=value){
        //     min.push(value);
        // }
        if(min>value){
          s.push(2L*value-min);
          min=value;
        }
        else{
            s.push((long)value);
        }
    }
    
    public void pop() {
        if(s.peek()<min){
            min=min*2L-s.peek();
            s.pop();
        }
        else{
        s.pop();

        }
    }
    
    public int top() {
        if(s.peek()<min){
            return (int)min;
        }
        long a=s.peek();
        return (int)a;
    }
    
    public int getMin() {
       return (int)min;
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