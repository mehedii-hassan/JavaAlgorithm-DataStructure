package ProblemPractice;

public class MyStack {

    int capacity = 5;
    int[] stack = new int[capacity];
    int top = -1;

    //Stack push operation
    void push(int x) {
        if (top < capacity - 1) {
            top = top + 1;
            stack[top] = x;
            System.out.println("Successfully pushed " + x);

        } else {
            System.out.println("Exception!Stack overflow.");
        }

    }

    //Stack pop operation
    int pop() {
        if (top < 0) {
            System.out.println("Exception!Stack underflow.");
            return -1;
        } else {
            int topItem = stack[top];
            stack[top] = -1;
            top--;
            return topItem;
        }

    }

    int peek() {
        if (top < 0) {
            System.out.println("Exception!Stack underflow.");
            return -1;
        } else {
            int val = stack[top];
            return val;
        }
    }

    void PrintStack() {

        System.out.println("Stack : ");
        for (int i = 0; i < capacity; i++) {
            System.out.println("index " + i + "= " + stack[i]);

        }
        System.out.println("");

    }

    public static void main(String[] args) {
        System.out.println("Implementing my stack.");
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println("Peek returned " + obj.peek());

        obj.push(50);
        obj.push(60);
        obj.PrintStack();
        System.out.println("successefully poped " + obj.pop());
        System.out.println("successefully poped " + obj.pop());
        System.out.println("successefully poped " + obj.pop());
        System.out.println("successefully poped " + obj.pop());
        System.out.println("successefully poped " + obj.pop());
        obj.pop();
        System.out.println("Peek returned " + obj.peek());
        System.out.println("Peek returned " + obj.peek());
        System.out.println("Peek returned " + obj.peek());
        obj.PrintStack();
    }

}
