import org.junit.Test;

import static org.junit.Assert.*;

public class linkedlisttest {

    @Test
    void testInsertAndToString() {
        linkedlist list = new linkedlist();
        list.insert(5);
        list.insert(10);
        list.insert(15);

        assertEquals("15 -> 10 -> 5 -> NULL", list.toString());
    }

    @Test
    void testAppendAndToString() {
        linkedlist list = new linkedlist();
        list.append(5);
        list.append(10);
        list.append(15);

        assertEquals("5 -> 10 -> 15 -> NULL", list.toString());
    }

    @Test
    void testInsertBeforeAndToString() {
        linkedlist list = new linkedlist();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insertBefore(10, 12);

        assertEquals("15 -> 12 -> 10 -> 5 -> NULL", list.toString());
    }

    @Test
    void testInsertAfterAndToString() {
        linkedlist list = new linkedlist();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insertAfter(10, 12);

        assertEquals("15 -> 10 -> 12 -> 5 -> NULL", list.toString());
    }

    @Test
    void testIsInclude() {
        linkedlist list = new linkedlist();
        list.insert(5);
        list.insert(10);
        list.insert(15);

        assertTrue(list.isInclude(10));
        assertFalse(list.isInclude(20));
    }
}
