package newlinkedlist;

/**
 *
 * @author Mehedi Hassan
 */
public class MyLinkedList {

    Node head;

    //Now add element end of the linked list
    public void insertAtTheEnd(int data) {
        Node node = new Node(data);
        //Check head is null
        if (head == null) {
            head = node;

        } else {
            Node n = head;
            //Chcek head.next = null or not 
            while (n.next != null) {
                n = n.next;

            }
            n.next = node;

        }

    }

    public void inserAtStart(int data) {
        
        Node node = new Node(data);
        head=node;
        node.next=head;
         

    }

    //Now showing the elements ---------
    public void show() {
        Node n1 = head;
        while (n1.next != null) {
            System.out.println(n1.data);
            n1 = n1.next;
        }
        System.out.println(n1.data);

    }

}
