# Implement a Hash Table Data Structure

## Description of the Challenge

This challenge involves implementing a hash table data structure in Java. A hash table is a data structure that maps keys to values. Keys are hashed into buckets, and values are stored in the buckets. Hash tables are efficient for retrieving values given a key.

The implementation of the hash table should include the following methods:

- `set(key, value)`: Inserts a key-value pair into the hash table. If the key already exists, it should update its value.
- `get(key)`: Returns the value associated with a given key or `null` if the key does not exist in the hash table.
- `has(key)`: Checks if a key exists in the hash table and returns `true` if it does, or `false` if it doesn't.
- `keys()`: Returns a list of all unique keys in the hash table.
- `hash(key)`: Computes the hash for a given key.

The time complexity of these methods should be O(1) on average, assuming a good hash function and a relatively even distribution of keys. In the worst case, when there are many collisions, the time complexity is O(n), where n is the number of keys.

This challenge will test your ability to implement a fundamental data structure and ensure that it performs efficiently for key-value mapping.


## Code 

```

package hashtable;
import java.util.LinkedList;

public class HashTable {
    private static final int TABLE_SIZE = 1000;
    private LinkedList<Entry>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
    }

    public void set(String key, String value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        table[index].add(new Entry(key, value));
    }

    public String get(String key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }

        for (Entry entry : table[index]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public boolean has(String key) {
        int index = hash(key);
        if (table[index] == null) {
            return false;
        }

        for (Entry entry : table[index]) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    public Iterable<String> keys() {
        LinkedList<String> keys = new LinkedList<>();
        for (LinkedList<Entry> entries : table) {
            if (entries != null) {
                for (Entry entry : entries) {
                    keys.add(entry.getKey());
                }
            }
        }
        return keys;
    }

    private int hash(String key) {
        int hash = key.hashCode();
        return Math.abs(hash) % TABLE_SIZE;
    }

    private class Entry {
        private String key;
        private String value;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}


```