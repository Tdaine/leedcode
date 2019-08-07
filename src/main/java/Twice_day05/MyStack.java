package Twice_day05;

import java.util.Stack;

/**
 * @author abaka
 * @date 2019/8/7 9:38
 */

/**
 * 两个栈实现一个队列
 */
public class MyStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if (stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
