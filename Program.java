package HashTables;
/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        MyHashTable<Integer> htInt = new MyHashTable<Integer>();

        Item<Integer> it1 = new Item<Integer>(1, 0); //1
        Item<Integer> it2 = new Item<Integer>(213, 2); // 11
        Item<Integer> it3 = new Item<Integer>(314, 3); // 31
        Item<Integer> it4 = new Item<Integer>(56, 4); // 56
        Item<Integer> it5 = new Item<Integer>(24, 5); // 24

        htInt.Insert(it1);
        htInt.Insert(it2);
        htInt.Insert(it3);
        htInt.Insert(it4);
        htInt.Insert(it5);

        htInt.Print();


    }
}