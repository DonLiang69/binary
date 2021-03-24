package ai.macchiato.oop;

import org.w3c.dom.Node;

public class NodeDemo {

    private int a;
    private int b;

    public NodeDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int increase(int x) {
        return increase(x) + 1;
    }

    public static void main(String[] args) {
        increase(1);
    }
}
