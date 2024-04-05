package HashTables;
public class MyHashTable<T> {
    private Object[] elements;
    private final int CAPACITY = 101;
    private int size;

    //todo
    // resolve generic types


    public MyHashTable() {
        elements = new Object[CAPACITY]; 
        size = 0;
    }

    //get size
    public int GetSize() {
        return size;
    }

    // todo search

    // todo delete

    // todo insert
    public void Insert(Item<T> item) {
        int key = HashCode(item.GetKey());
        elements[key] = item.GetData();
        size++;
    }


    // linear probing

    // hashing function
    public int HashCode(int key) {
        return key % CAPACITY;
    }

    //print elements

    public void Print() {
        for(int i = 0; i < CAPACITY; i++) {
            if(elements[i] != null) {
                System.out.println("Index = " + i + " Data = " + elements[i]);
            }
        }
    }



    
}