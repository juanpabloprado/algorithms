import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LRUCache<K, V> implements Cache<K, V> {
    private final int capacity;
    private final Map<K, V> map;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public LRUCache(int capacity) {
        this.map = new LinkedHashMap<>(capacity);
        this.capacity = capacity;
    }

    @Override
    public V put(K key, V value) {
        lock.writeLock().lock();
        try {
            if (!map.containsKey(key) && map.size() == capacity) {
                var it = map.keySet().iterator();
                it.next();
                it.remove();
            }
            return map.put(key, value);
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public Optional<V> get(K key) {
        lock.readLock().lock();
        try {
            var value = map.get(key);
            if (value == null) {
                return Optional.empty();
            }
            return Optional.of(value);
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public int size() {
        lock.readLock().lock();
        try {
            return map.size();
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        lock.writeLock().lock();
        try {
            map.clear();
        } finally {
            lock.writeLock().unlock();
        }
    }

}