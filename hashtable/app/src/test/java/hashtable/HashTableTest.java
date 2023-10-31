package hashtable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {
    private HashTable hashTable;

    @BeforeEach
    public void setUp() {
        hashTable = new HashTable();
    }

    @Test
    public void testSetAndGet() {
        hashTable.set("key1", "value1");
        assertEquals("value1", hashTable.get("key1"));
    }

    @Test
    public void testSetDuplicateKey() {
        hashTable.set("key2", "value2");
        hashTable.set("key2", "new_value");
        assertEquals("new_value", hashTable.get("key2"));
    }

    @Test
    public void testGetNonExistentKey() {
        assertNull(hashTable.get("nonexistent_key"));
    }

    @Test
    public void testHasExistingKey() {
        hashTable.set("key3", "value3");
        assertTrue(hashTable.has("key3"));
    }

    @Test
    public void testHasNonExistentKey() {
        assertFalse(hashTable.has("nonexistent_key"));
    }

    @Test
    public void testKeys() {
        hashTable.set("key4", "value4");
        hashTable.set("key5", "value5");
        Iterable<String> keys = hashTable.keys();
        assertTrue(keysContains(keys, "key4"));
        assertTrue(keysContains(keys, "key5"));
    }

    private boolean keysContains(Iterable<String> keys, String target) {
        for (String key : keys) {
            if (key.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
