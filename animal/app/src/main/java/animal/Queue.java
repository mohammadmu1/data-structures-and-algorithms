package animal;

import java.util.NoSuchElementException;

public class Queue<t> {
    private class Node {
        Node next;
        t val;

        Node(t val) {
            this.val = val;
        }
    }

    private Node front = null;
    private Node back = null;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(t val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            front = newNode;
            back = front;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    public t dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        if (front == back) {
            t ans = front.val;
            front = null;
            back = null;
            return ans;
        }
        t ans = front.val;
        front = front.next;
        return ans;
    }

    public t peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.val;
    }
}
