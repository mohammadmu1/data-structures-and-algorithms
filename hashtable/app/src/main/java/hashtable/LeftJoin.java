package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {

    public static List<List<String>> leftJoin(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
        List<List<String>> result = new ArrayList<>();

        for (String key : hashmap1.keySet()) {
            String valueFromHashmap1 = hashmap1.get(key);
            String valueFromHashmap2 = hashmap2.getOrDefault(key, null);

            List<String> inner = new ArrayList<>();
            inner.add(key);
            inner.add(valueFromHashmap1);
            inner.add(valueFromHashmap2);

            result.add(inner);
        }

        return result;
    }

}