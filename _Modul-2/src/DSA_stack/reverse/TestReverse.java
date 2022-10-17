package DSA_stack.reverse;

import java.util.LinkedList;

public class TestReverse {
    public static void main(String[] args) {
        MyStack<String> wStack = new MyStack<String>();
        MyStack<String> outStack = new MyStack<String>();
        wStack.push("m");
        wStack.push("W");
        wStack.push("o");
        wStack.push("r");
        wStack.push("d");
        System.out.println("Stack after swap: ");
        while (!wStack.isEmpty()) {
            outStack.push(wStack.pop());
        }
        for (int i = 0; i < outStack.size(); i++) {
            outStack.get(i);
        }
    }
}
