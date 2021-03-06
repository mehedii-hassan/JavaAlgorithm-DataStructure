package linkedlist;

/**
 *
 * @author Mehedi Hassan
 */
public class LinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
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

    //printine linked list elements 
    public void show() {
        while (head.next != null) {
            System.out.println(head.data);
            head = head.next;

        }
        System.out.println(head.data);
    }

}
