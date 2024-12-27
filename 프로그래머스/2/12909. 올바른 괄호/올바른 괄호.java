import java.util.EmptyStackException;
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            try {
                if (current == '(') {
                    stack.push(current);
                } else {
                    stack.pop();
                }
            } catch (EmptyStackException e) {
                return false;
            }
        }
        
        if (stack.isEmpty()) {
            return true;
        }
        
        return false;
    }
}