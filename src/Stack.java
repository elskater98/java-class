import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack {

    private int[] array;
    private int capacity;
    private int top;

    public Stack(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int value) {
        if (!isFull()) {
            this.top = this.top + 1;
            this.array[this.top] = value;
            // this.array[++this.top]=value;
        }
    }

    public int pop() {
        int aux = this.array[this.top];
        this.top = this.top - 1;
        return aux;
    }

    public boolean isEmpty() {
        return this.array.length == 0;
    }

    public boolean isFull() {
        return this.size() == this.capacity;
    }

    public int size() {
        return this.top + 1;
    }

    public void print() {
        System.out.println(Arrays.toString(this.array));
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.print();
        System.out.println(stack.isEmpty());
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        System.out.println(stack.isFull());
        //stack.add(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.print();
    }
}
