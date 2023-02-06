// 32. Longest Valid Parentheses
// Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
// substring
import java.util.*;
class longestValidParentheses{
    public static int check(String ss) {
        Stack<Integer>s=new Stack<>();
        s.push(-1);
        int max=0;
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)=='(')
            s.push(i);
            else{
                s.pop();
                if(s.isEmpty()){
                    s.push(i);
                }
                else{
                    max=Math.max(max,i-s.peek());
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s=")()())";
        int result=check(s);
        System.out.println(result);
        
    }
    
}