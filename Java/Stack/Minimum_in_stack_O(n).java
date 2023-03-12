import java.util.*;
class MinStack {  

    // O(n) -> using extra space - an supporting stack for keeping minimum value

    Stack<Integer> s=new Stack<Integer>();
    Stack<Integer> ss=new Stack<Integer>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        if(ss.size()==0 || ss.peek()>=val)
        ss.push(val);
        return;
    }
    
    public void pop() {
        if(s.size()==0) return;
        int check=s.pop();
        if (check==ss.peek())
        ss.pop();
        return;

    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        if(ss.size()==0)
        return -1;
        return ss.peek();
    }
}