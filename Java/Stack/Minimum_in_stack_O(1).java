import java.util.*;
class MinStack {

    // O(1) -> constt extra space

    Stack<Long> s=new Stack<>();
    Long elem=Long.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int value) {
        Long val=Long.valueOf(value);
        if(s.size()==0)
        {
            s.push((Long)val);
            elem=val;
        }
        else{
            if(val>=elem)
            s.push(val);
            else if(val<elem)
            {
                s.push(2*val-elem);
                elem=val;
            }
        }
        return;
    }
    
    public void pop() {
        if(s.size()==0) return;
        else{
            if(s.peek()>=elem)
            s.pop();
            else if(s.peek()<elem)
            {
                elem=2*elem-s.peek();
                s.pop();
            }
        }
    }
    
    public int top() {
        if(s.size()==0) return -1;
        else
        {
            if(s.peek()>=elem)
            return s.peek().intValue();
            else if(s.peek()<elem)
            return elem.intValue();
        }
        return -1;
    }
    
    public int getMin() {
        if(s.size()==0) return -1;
        return elem.intValue();
    }
}
class Minimum_in_stack_O(1){
    public static void main(String[] args) {
        MinStack obj=new MinStack();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */