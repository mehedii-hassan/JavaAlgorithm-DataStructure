package linkedlist1;

/**
 *
 * @author Mehedi Hassan
 */
public class TestClass {

    public static void main(String[] args) {
        LinkedList_1 ob = new LinkedList_1();
//        ob.insertAtStart(1);

        ob.insert(10);
        ob.insert(200);
//        ob.insert(300);
//        ob.insertAtStart(1);
//        ob.insertAtStart(50);
//        ob.insertAtStart(50);
//        ob.insertAtStart(50);
//        ob.insertAtStart(50);
//        ob.insertAt(0, 1000);
//        ob.insertAt(2, 1000);
//        ob.deleteAt(3);
        ob.show();
        ob.searchElement(50);

    }

}
