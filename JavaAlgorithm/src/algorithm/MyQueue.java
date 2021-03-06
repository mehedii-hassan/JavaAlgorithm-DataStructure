package algorithm;

public class MyQueue {

    int capacity = 5;
    int[] Queue = new int[capacity];
    int front = 0;
    int rear = -1;
    int totalItem = 0;

    boolean isFull() {
        return totalItem == capacity;

    }

    boolean isEmpty() {
        return totalItem == 0;

    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Exception!Queue is full.");
        } else {
            rear = (rear + 1) % capacity;
            Queue[rear] = x;
            totalItem++;
            System.out.println("Successfully added " + x);
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Exception!Queue is empty.");
            return -1;
        } else {
            int val = Queue[front];
            Queue[front] = -1;
            front = (front + 1)%capacity;
            totalItem--;
            return val;

        }

    }

    void PrintElemnts() {
        System.out.print("Queue : ");
        for (int i = 0; i < capacity; i++) {
            System.out.print(" " + Queue[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Implementing my Queue :");
        MyQueue obj = new MyQueue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.enqueue(60);
        obj.PrintElemnts();
        System.out.println("Queue deleted " + obj.dequeue());
        System.out.println("Queue deleted " + obj.dequeue());
        obj.enqueue(50);

        obj.PrintElemnts();
        obj.enqueue(50);
                System.out.println("Queue deleted " + obj.dequeue());
                System.out.println("Queue deleted " + obj.dequeue());
                System.out.println("Queue deleted " + obj.dequeue());
                System.out.println("Queue deleted " + obj.dequeue());
                System.out.println("Queue deleted " + obj.dequeue());
                System.out.println("Queue deleted " + obj.dequeue());


    }
}
