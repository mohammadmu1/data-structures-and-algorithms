/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void testPush() {
        stack.push(1);
        assertFalse(stack.isempty());
    }

    @Test
    public void testPushMultipleValues() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertFalse(stack.isempty());
    }

    @Test
    public void testPop() {
        stack.push(1);
        int poppedValue = stack.pop();
        assertEquals(1, poppedValue);
        assertTrue(stack.isempty());
    }

    @Test
    public void testEmptyStackAfterMultiplePops() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isempty());
    }

    @Test
    public void testPeek() {
        stack.push(42);
        int peekedValue = stack.peek();
        assertEquals(42, peekedValue);
        assertFalse(stack.isempty());
    }

    @Test
    public void testInstantiateEmptyStack() {
        assertTrue(stack.isempty());
    }

    @Test
    public void testPopOnEmptyStackRaisesException() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

    @Test
    public void testPeekOnEmptyStackRaisesException() {
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }
}