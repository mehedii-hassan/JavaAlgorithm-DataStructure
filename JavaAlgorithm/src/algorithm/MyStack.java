package algorithm;

public class MyStack {

    int capacity = 3;
    int[] Stack = new int[capacity];
    int top = -1;
    
    //Stack Push Operation
    void Push(int x) {
        if (top < capacity - 1) {
            top = top + 1;
            Stack[top] = x;
            System.out.println("Successefully added " + x);

        } else {
            System.out.println("Exception!Stack Underflow.");
        }
    }
    
    //Stack Pop operation
    int Pop() {
        if (top < 0) {
            System.out.println("Exception!Stack Underflow.");
            return -1;
        } else {
            int value = Stack[top];
            top = top - 1;
            return value;
        }

    }

    int Peek() {
        if(top<0){
            System.out.println("Exception!Stack Underflow.");
            return -1;
        }else{
            int val = Stack[top];
            return val;
        
        }

     
    }

    public static void main(String[] args) {
        System.out.println("Implementing My Stack");
        MyStack obj = new MyStack();
        obj.Peek();
        obj.Push(10);
        obj.Push(20);
        
        System.out.println("Pop deleted  :" + obj.Pop());
        System.out.println("Pop deleted  :" + obj.Pop());
        System.out.println("Peek Returned :"+obj.Peek());
       

    }

}
