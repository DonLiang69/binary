package ai.macchiato.oop;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
//     FIFO
//    通过add()/offer()方法将元素添加到队尾；
//    通过remove()/poll()从队首获取元素并删除；
//    通过element()/peek()从队首获取元素但不删除。

    public static int increase(int x) {
        return increase(x) + 1;
    }

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("a");
        q.offer("b");
        q.offer("c");
        q.offer("d");
        q.offer("e");

//        System.out.println(q);
//        System.out.println(q.peek());

        q.poll();
        System.out.println(q.peek());
        System.out.println(q);

//        System.out.println(q.peek());
//        increase(1);
    }
}
