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
