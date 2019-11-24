package com.tian.leetcode;

import java.util.Stack;

/**
 * @author tianchengbei
 * @since 2019-11-23
 */
public class Solution_20 {

    //([)]  {[]}
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                if (ch == ')' || ch == '}' || ch == ']') return false;
                stack.push(ch);
            }else {
                Character peek = stack.peek();
                if(peek == '(' && ch == ')') stack.pop();
                else if(peek == '{' && ch == '}') stack.pop();
                else if(peek == '[' && ch == ']') stack.pop();
                else stack.push(ch);
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }


}
