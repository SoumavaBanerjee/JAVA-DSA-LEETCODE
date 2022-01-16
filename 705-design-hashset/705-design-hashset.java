class MyHashSet {
    
    ArrayList<Boolean> map;
    int size;

    
    public MyHashSet() {
        size = 1000000;
        map = new ArrayList<Boolean>(Collections.nCopies(size+1, false));
        
    }
    
    public void add(int key) {
        map.set(key,true);
    }
    
    public void remove(int key) {
        map.set(key,false);
    }
    
    public boolean contains(int key) {
        return map.get(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */