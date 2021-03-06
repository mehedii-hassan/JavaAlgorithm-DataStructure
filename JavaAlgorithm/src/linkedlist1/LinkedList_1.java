package linkedlist1;

public class LinkedList_1 {

    Node head;

    //--------Insert function-----------
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

    //prepend function--------------
    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;

    }

    //insert index location-----------
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (index == 0) {
            insertAtStart(data);

        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;

            }
            node.next = n.next;
            n.next = node;
        }

    }

    //Delete function---------------
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;

            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("Deteting element  = " + n1.data);

        }

    }

    //Search element ----------------------
    public void searchElement(int data) {
        int count = 0;
        int index = 0;

        //check wheather list is empty----
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (head != null) {
                if (head.data == data) {
                    count++;
                    System.out.println("the element is present at index  " + index);

                }
                index++;
                head = head.next;

            }
            System.out.println("Count =  " + count);
        }

    }

    //-------------Print the elements 
    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);

    }
}
