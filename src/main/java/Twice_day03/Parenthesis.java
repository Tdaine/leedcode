package Twice_day03;

import java.util.Stack;

public class Parenthesis {

    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < A.length(); i++){
            if (A.charAt(i) == '(')
                stack.push('(');
            else if (A.charAt(i) == ')' && (stack.isEmpty() || stack.peek() == ')')){
                return false;
            }else if (A.charAt(i) == ')'){
                stack.pop();
            }
        }
        if (stack.isEmpty())
            return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(new Parenthesis().chkParenthesis("((())",6));
    }
}