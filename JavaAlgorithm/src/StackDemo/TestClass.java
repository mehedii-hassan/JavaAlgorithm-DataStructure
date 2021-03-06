package StackDemo;

/**
 *
 * @author Mehedi Hassan
 */
public class TestClass {

    public static void main(String[] args) {
        System.out.print("Enter your stack capacity : ");
        My_Own_Stack obj = new My_Own_Stack();
        obj.peek();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        //obj.peek();
        obj.pop();
        obj.pop();
        obj.push(40);
        obj.push(1000);
        obj.peek();
                

    }

}
