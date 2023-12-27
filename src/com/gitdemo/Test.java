package com.gitdemo;

import java.util.Stack;

/**
 * @Description:
 * @Author: ldk
 * @Date: 2023/12/27 19:07
 */
public class Test {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println("hello world!");
    }

}
