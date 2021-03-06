 
package ProblemPractice.linkedlist;

/**
 *
 * @author Mehedi Hassan
 */
public class MainClass {
    public static void main(String[] args) {
        LinkedList ob = new LinkedList();
        ob.insert(20);
        ob.insert(20);
        ob.insert(20);
        ob.insertAtStart(1);
        ob.insertAt(0,140);
        ob.deleteAt(0);
        ob.show();
        
    }
    
}
