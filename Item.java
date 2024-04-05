package HashTables;
public class Item<T> {
    // private properties    
    private int key;
    private T data;

    public Item(int key, T data) {
        this.key = key;
        this.data = data;
    }

    //get/set key
    public int GetKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }

    //get/set data
    public T GetData(){
        return data;
    }
    public void SetData(T data) {
        this.data = data;
    }
}