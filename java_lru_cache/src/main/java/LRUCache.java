import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class LRUCache<K, V> implements Cache<K, V> {
    private final int capacity;
    private final Map<K, V> map;

    public LRUCache(int capacity) {
        this.map = Collections.synchronizedMap(new LinkedHashMap<>(capacity));
        this.capacity = capacity;
    }

    @Override
    public V put(K key, V value) {
        if (!map.containsKey(key) && map.size() == capacity) {
            var it = map.keySet().iterator();
            it.next();
            it.remove();
        }
        return map.put(key, value);
    }

    @Override
    public Optional<V> get(K key) {
        var value = map.get(key);
        if (value == null) {
            return Optional.empty();
        }
        return Optional.of(value);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        map.clear();
    }

}