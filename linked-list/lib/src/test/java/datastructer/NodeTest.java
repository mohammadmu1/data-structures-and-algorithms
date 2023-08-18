package datastructer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import linkedlist.list.LinkedList;


public class NodeTest {

    @Test
    void testInsertAndToString() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(7);
        linkedList.insert(10);

        assertEquals("10 -> 7 -> 3 -> NULL", linkedList.toString());
    }

    @Test
    void testIsInclude() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(7);
        linkedList.insert(10);

        assertTrue(linkedList.isInclude(7));
        assertFalse(linkedList.isInclude(5));
    }
}
