package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return q1.poll();
    }

    public int top() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Empty: " + stack.empty()); 
        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Empty: " + stack.empty()); 
    }
}