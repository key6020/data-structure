package data_structure;

import java.util.EmptyStackException;

public class ArrayStack {
    /**
     * Stack
     * <p>
     * Abstract data type
     * LIFO
     * push/pop/peek (top)
     * cf. linked list(O(1)), array(O(n))-resize
     */
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack =  new Employee[capacity];
    }

    public void push(Employee employee) {
        if(top == stack.length) {
            // stack is full -> need to resize the array
            Employee[] newArr = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArr, 0, stack.length);
            stack = newArr;
        }

        stack[top++] = employee;
    }

    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee =  stack[--top];
        stack[top] = null;

        return employee;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public Employee peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top -1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for(int i = top-1; i>=0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("RM", "Kim", 912));
        stack.push(new Employee("Jin", "Kim", 1204));
        stack.push(new Employee("Jimin", "Park", 1013));
        stack.push(new Employee("JK", "Jeon", 901));
        stack.push(new Employee("V", "Kim", 1230));

//        stack.printStack();

//        System.out.println(stack.peek());
//        stack.printStack();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.pop());

//        stack.printStack();
    }
}
