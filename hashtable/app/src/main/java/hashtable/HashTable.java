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
