package stack.queue.pseudo;
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
