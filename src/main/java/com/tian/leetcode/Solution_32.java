package com.tian.leetcode;

import java.util.Stack;

public class Solution_32 {

    public static void main(String[] args) {
        Solution_32 solution_32 = new Solution_32();
        String s = "(()";
        int i = solution_32.longestValidParentheses(s);
        System.out.println(i);
    }

    // )()())   (() "()(()"
    public int longestValidParentheses(String s) {
        if ((s = s.trim()).length() == 0) return 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for(int j =i+2;j<=s.length();j=j+2){
                if(invalid(s.substring(i,j))) result = Math.max(result,j-i);
            }
        }
        return result;
    }
    //()(()
    boolean invalid(String s){
        Stack<Character> stackCheck = new Stack<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                stackCheck.push(c);
            }else if(!stackCheck.isEmpty() && stackCheck.peek() == '('){
                stackCheck.pop();
            }else {
                return false;
            }
        }
        return stackCheck.isEmpty();
    }

}
