# implement Queue 
<!-- Description of the  -->

The challenge is to implement a queue using stacks.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../stack-queue-pseudo/Whiteboard%202.png)
### the code

```

public class Queue<T> implements PseudoQueue<T> {
    // Stack references
    private Stack<T> stack1;
    private Stack<T> stack2;

    public Queue() {
        // Create custom generic stacks
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T val) {
        // Move elements from stack2 to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        // Push the new value onto stack1
        stack1.push(val);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        // Move elements from stack1 to stack2 if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Pop the element from stack2
        return stack2.pop();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        // Move elements from stack1 to stack2 if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Peek at the top element of stack2
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}



```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
## enqueue

1-Reorder Elements: If there are any elements in stack2, we move them to stack1. This helps maintain the correct order of elements, so the first element enqueued remains at the front of the queue.

2-Add the New Element: We add the new element (the one you want to enqueue) to the end of stack1. This ensures the newly added element is at the back of the queue.

## dequeu 

1-Check if the Queue is Empty: First, we check if the queue is empty. If it is, we cannot dequeue anything, so we throw an exception to indicate that the queue is empty.

2-Prepare for Dequeue: To dequeue an element, we need to make sure the elements are in the right order. We do this by checking if stack2 (our second stack) is empty.

3-Move Elements to stack2: If stack2 is empty, we move all the elements from stack1 to stack2. This step ensures that the elements in stack2 are in the correct order for dequeueing. We do this by repeatedly popping elements from stack1 and pushing them onto stack2.

4-Dequeue: Finally, we can pop an element from stack2. This element was originally the first-in element in the queue, so it's the one we want to dequeue.



### Big O space/time
 * Time Complexity  O(n)
 * Space Complexity O(n)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue<Integer> queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue<>();
    }

    @Test
    public void testEnqueueAndDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
    }

    @Test
    public void testPeek() {
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.peek());
        assertEquals(1, queue.peek()); // Peek should not remove the element
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEmptyQueueDequeue() {
        assertThrows(IllegalStateException.class, () -> queue.dequeue());
    }

    @Test
    public void testEmptyQueuePeek() {
        assertThrows(IllegalStateException.class, () -> queue.peek());
    }
}


``` 
