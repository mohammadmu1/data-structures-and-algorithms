package hashtable;
import java.util.LinkedList;

public class HashTable<K, V> {
    private static final int TABLE_SIZE = 1000;
    private LinkedList<Entry<K, V>>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
    }

    public void set(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        table[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public boolean has(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return false;
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    public Iterable<K> keys() {
        LinkedList<K> keys = new LinkedList<>();
        for (LinkedList<Entry<K, V>> entries : table) {
            if (entries != null) {
                for (Entry<K, V> entry : entries) {
                    keys.add(entry.getKey());
                }
            }
        }
        return keys;
    }

    private int hash(K key) {
        int hash = key.hashCode();
        return Math.abs(hash) % TABLE_SIZE;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
