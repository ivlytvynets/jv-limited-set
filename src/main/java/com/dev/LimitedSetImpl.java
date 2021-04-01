package com.dev;

import java.util.HashMap;
import java.util.Map;

public class LimitedSetImpl<T> implements LimitedSet<T> {
    private static final int MAX_SIZE = 10;
    private Map<T, Integer> map;

    public LimitedSetImpl() {
        map = new HashMap<>();
    }

    @Override
    public void add(T o) {
        if (!map.containsKey(o)) {
            if (map.size() == MAX_SIZE) {
                map.remove(findMinimalUsages());
            }
            map.put(o, 0);
        }
    }

    @Override
    public boolean remove(T o) {
        return map.remove(o) != null;
    }

    @Override
    public boolean contains(T o) {
        if (!map.containsKey(o)) {
            return false;
        } else {
            map.put(o, map.get(o) + 1);
            return true;
        }
    }

    private T findMinimalUsages() {
        int minUsages = Integer.MAX_VALUE;
        T result = null;
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minUsages) {
                minUsages = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
