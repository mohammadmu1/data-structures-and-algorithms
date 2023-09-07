package animal;

public class Stack<t> {
    private class Node {
        t val;
        Node next;

        Node(t val) {
            this.val = val;
        }
    }

    private Node top = null;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(t value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public t pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        t temp = top.val;
        top = top.next;
        return temp;
    }

    public t peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return top.val;
    }
}
