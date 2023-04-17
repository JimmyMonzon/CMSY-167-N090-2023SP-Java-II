package edu.howardcc.cmsy167.simplemap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Implementation of SimpleMap using a custom binary search tree
 */
public class CustomBinaryTreeSimpleMap<K extends Comparable<K>, V> implements SimpleMap<K, V> {
    private final Map<K, V> map;

    public CustomBinaryTreeSimpleMap() {
        map = new TreeMap<>();
    }

    @Override
    public void clear() {
        for (int i=0; i<map.size(); i++){
            map.remove(i);
        }
    }
    
    @Override
    public V put(K key, V value) {
        // TODO
        return null;
    }

    @Override
    public V get(K key) {
        // TODO
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        // TODO
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(map.size()==0){
            return true;
        }
        return false;
    }
    
}
