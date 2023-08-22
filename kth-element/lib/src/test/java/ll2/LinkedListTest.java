package ll2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LinkedListTest {
    @Test
    void testInsertAndToString() {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);

        assertEquals("15 -> 10 -> 5 -> NULL", list.toString());
    }

    @Test
    public void testKthFromEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        assertEquals(4, linkedList.kthFromEnd(1));
        assertEquals(2, linkedList.kthFromEnd(3));
        assertEquals(1, linkedList.kthFromEnd(4));
        assertEquals(5, linkedList.kthFromEnd(0));


        assertEquals(-12345, linkedList.kthFromEnd(10));
    }
    @Test
    void testInsertBeforeAndToString() {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insertBefore(10, 12);

        assertEquals("15 -> 12 -> 10 -> 5 -> NULL", list.toString());
    }
    //
    @Test
    void testInsertAfterAndToString() {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insertAfter(10, 12);

        assertEquals("15 -> 10 -> 12 -> 5 -> NULL", list.toString());
    }

    @Test
    void testIsInclude() {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);

        assertTrue(list.isInclude(10));
        assertFalse(list.isInclude(20));
    }
}
