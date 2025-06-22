package Queue;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> s1; 
    private Stack<Integer> s2; 

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println("Peek: " + queue.peek()); // 1
        System.out.println("Pop: " + queue.pop());   // 1
        queue.push(3);
        System.out.println("Peek: " + queue.peek()); // 2
        System.out.println("Pop: " + queue.pop());   // 2
        System.out.println("Pop: " + queue.pop());   // 3
        System.out.println("Empty: " + queue.empty()); // true
    }
}
