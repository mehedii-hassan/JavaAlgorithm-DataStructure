package QueueDemo;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class QueueDemo {

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] queue = new int[size];

    int front = -1;
    int rear = -1;

    public void enqueue(int item) {
        while (rear < size) {

            if (front < 0 && rear < 0) {
                front += 1;
                rear += 1;
                queue[rear] = item;
                System.out.println("first element added successfully" + item);

            } else {

                rear += 1;
                queue[rear] = item;
                System.out.println("Successfully added " + item);
            }
        }

    }

    void display() {
        for (int i = 0; i < 10; i++) {

        }
    }

}
