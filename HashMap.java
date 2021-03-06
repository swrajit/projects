import java.util.HashMap;

class MyHashMap {

    /** Initialize your data structure here. */
    HashMap<Integer,Integer> hm;
    public MyHashMap() {
        hm = new HashMap<>();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        hm.put(key,value);
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(hm.containsKey(key))
            return hm.get(key); 
        
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        hm.remove(key);
    }
}