package StackDemo;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class My_Own_Stack {

    Scanner scanner = new Scanner(System.in);
    int capacity = scanner.nextInt();
    int[] stack = new int[capacity];
    int top = -1;

    //Now adding element on the top of the stack---------
    void push(int item) {
        //Chceking stack is full-------
        if (top < capacity - 1) {
            top = top + 1;
            stack[top] = item;
            System.out.println("Successfully added " + item);
        } else {
            System.out.println("Exception!Stack overflow.");
        }

    }

    public int pop() {
        //Now checking stack is empty----------
        if (top < 0) {
            System.out.println("Exception!Stack undeflow.");
            return -1;
        } else {
            int topItem = stack[top];
            top--;
            System.out.println("Successfully deleted " + topItem);
            return topItem;

        }
    }

    public int peek() {
        //Now checking stack is empty--------------
        if (top < 0) {
            System.out.println("Exception!Stack underflow.");
            return -1;
        } else {
            int topItem = stack[top];
            System.out.println("Stack's top item is : " + topItem);
            return topItem;

        }
    }

}
