package stack.queue.pseudo;
import java.util.Stack;
public class Queue<T> implements PseudoQueue<T>{
    private Stack<T> stack1;
    private Stack<T> stack2;

    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void enqueue(T val) {
        stack1.push(val);
    }


    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stack2.isEmpty()) {

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        T ans = stack2.pop();


        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return ans;
    }


    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stack2.isEmpty()) {

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        T ans = stack2.peek();


        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return ans;
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public int size() {
        return stack1.size();
    }
}
