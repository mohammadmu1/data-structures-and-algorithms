package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    private HashTable<String, Integer> hashTable;

    @Before
    public void setUp() {
        hashTable = new HashTable<>();
    }

    @Test
    public void testSizeIsEmpty() {
        assertTrue(hashTable.isEmpty());
        assertEquals(0, hashTable.size());

        hashTable.add("one", 1);
        assertFalse(hashTable.isEmpty());
        assertEquals(1, hashTable.size());

        hashTable.remove("one");
        assertTrue(hashTable.isEmpty());
        assertEquals(0, hashTable.size());
    }

    @Test
    public void testAddAndGet() {
        hashTable.add("one", 1);
        hashTable.add("two", 2);

        assertEquals(Integer.valueOf(1), hashTable.get("one"));
        assertEquals(Integer.valueOf(2), hashTable.get("two"));
        assertNull(hashTable.get("nonexistent"));
    }

    @Test
    public void testRemove() {
        hashTable.add("one", 1);
        hashTable.add("two", 2);

        assertEquals(2, hashTable.size());

        Integer removedValue = hashTable.remove("one");
        assertEquals(Integer.valueOf(1), removedValue);
        assertEquals(1, hashTable.size());
        assertNull(hashTable.get("one"));
    }


    }

