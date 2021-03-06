package ProblemPractice.linkedlist;

/**
 *
 * @author Mehedi Hassan
 */
public class LinkedList {

    Node head;

    // insert function ----------------
    public void insert(int data) {
        Node node = new Node(data);
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;

            }
            n.next = node;

        }

    }

    //-----------prepend function------------
    public void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = null;
        node.next = head;
        head = node;

    }

    //-----------insert at indexvalue------------
    public void insertAt(int index, int data) {

        Node node = new Node(data);
        node.next = null;

        Node n = head;

        if (index == 0) {
            insertAtStart(data);
        } else {

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;

            }
            n1 = n.next;
            n.next = n1.next;
        }

    }

    public void searchElement(int searchValue) {
        
        int count ;
        while (head != null) {
            if (head.data == searchValue) {
                System.out.println("Found element");

            }

        }

    }

    //---------printing  the elements ---------
    public void show() {
        Node n = head;
        while (n.next != null) {

            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);

    }

}
