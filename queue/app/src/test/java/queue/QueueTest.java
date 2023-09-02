package queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;
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