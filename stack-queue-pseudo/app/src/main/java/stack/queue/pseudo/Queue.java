package stack.queue.pseudo;

public class Queue<T> implements PseudoQueue<T>{
    //stack ref
    private Stack<T> stack1;
    private Stack<T> stack2;

    public Queue() {
        //create stack
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void enqueue(T val) {

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }


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
        return stack1.isEmpty() && stack2.isEmpty();
    }


}
