package stack.queue.pseudo;

public class Stack<T> {


    private class Node {
        T val;
        Node next;

        Node(T val) {
            this.val = val;
        }
    }

    private Node top = null;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        T temp = top.val;
        top = top.next;
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return top.val;
    }
}
