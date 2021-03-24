package ai.macchiato.oop;

import java.util.Stack;

public class StackDemo {
//    LIFO
//    把元素压栈：push(E)；
//    把栈顶的元素“弹出”：pop(E)；
//    取栈顶元素但不弹出：peek(E)。

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        stack.pop();
        System.out.println(stack.peek());

        System.out.println(stack.search("d"));

//        System.out.println(stack.search("c"));
//        System.out.println(stack.peek());
//        stack.pop();
        System.out.println(stack.toString());
//        System.out.println(stack.peek());


    }

}
