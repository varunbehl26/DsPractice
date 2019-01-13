package com.company.stacksandqueues;

import java.util.Stack;

public class StackMin {


    public static void main(String[] args) {
        Stack stack1 = new Stack();

        stack1.push(5);
        stack1.push(1);
        stack1.push(3);
        stack1.push(8);

        System.out.print(stack1.pop().toString());
    }


}


