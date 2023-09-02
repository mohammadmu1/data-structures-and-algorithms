# linkedlist implementation  
<!-- Description of the  -->
the challenge is   implemntation queue  using LinkedIist

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../queue/Whiteboard%20(2).png)
### the code

```
public class Queue {
    private class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
        }
    }
    private Node front=null;
    private Node back=null;
    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int val){
        Node newNode =new Node(val);
        if(isEmpty()){
            front=newNode;
            back=front;
        }
        else{
            back.next=newNode;
            back=newNode;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        if(front==back){
            int ans =front.val;
            front =null;
            back=null;
            return ans;
        }
        int ans =front.val;
        front = front.next;
        return ans;
    }
        public int peek(){
            if(isEmpty()){
                throw new NoSuchElementException("Queue is empty");
            }


            return front.val;
            }


}



```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach

## Queue Class Explanation

### Node Class
- The `Node` class is a private inner class within the `Queue` class.
- Each node has two properties:
  - `val`: Stores the value of the element.
  - `next`: Points to the next element (node) in the queue.

### Private Fields
- `front`: A private field that initially points to `null`. It keeps track of the front (first) element of the queue.
- `back`: A private field that also initially points to `null`. It keeps track of the back (last) element of the queue.

### `isEmpty` Method
- Checks whether the queue is empty or not.
- Returns `true` if `front` is `null`, indicating an empty queue, and `false` otherwise.

### `enqueue` Method
- Creates a new `Node` called `newNode` with the provided value.
- If the queue is empty (i.e., `front` is `null`):
  - Sets both `front` and `back` to `newNode`, making it the only element in the queue.
- If the queue is not empty:
  - Links the current `back` to the `newNode`, indicating that `newNode` is the new last element (back) in the queue.
  - Updates `back` to point to `newNode`.

### `dequeue` Method
- Removes and returns the front element (first element) from the queue.
- If the queue is empty (i.e., `front` is `null`), raises a `NoSuchElementException` because you can't dequeue from an empty queue.
- If there's only one element in the queue (i.e., `front` and `back` point to the same node):
  - Removes that element by setting both `front` and `back` to `null`, effectively emptying the queue.
  - Returns the value of the removed element.
- If there are more than one element in the queue:
  - Removes the front element by updating `front` to point to the next element in the queue.
  - Returns the value of the removed element.

### `peek` Method
- Allows you to view the value of the front element in the queue without removing it.
- If the queue is empty (i.e., `front` is `null`), raises a `NoSuchElementException` because you can't peek into an empty queue.
- If the queue is not empty, simply returns the value of the front element (`front.val`).



### Big O space/time
 * Time Complexity  O(n)
 * Space Complexity O(1)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```
public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue();
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testEnqueueMultipleValues() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeue() {
        queue.enqueue(1);
        int dequeuedValue = queue.dequeue();
        assertEquals(1, dequeuedValue);
    }

    @Test
    public void testPeek() {
        queue.enqueue(42);
        int peekedValue = queue.peek();
        assertEquals(42, peekedValue);
    }

    @Test
    public void testEmptyQueueAfterDequeues() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testInstantiateEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueOnEmptyQueueRaisesException() {
        assertThrows(NoSuchElementException.class, () -> queue.dequeue());
    }

    @Test
    public void testPeekOnEmptyQueueRaisesException() {
        assertThrows(NoSuchElementException.class, () -> queue.peek());
    }
}


``` 
