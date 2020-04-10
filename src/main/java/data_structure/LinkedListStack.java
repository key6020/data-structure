package data_structure;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {
    private LinkedList<Employee> stack;

    // constructor
    public LinkedListStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Employee rm = new Employee("RM", "Kim", 912);
        Employee jin = new Employee("Jin", "Kim", 1204);
        Employee jimin = new Employee("Jimin", "Park", 1013);
        Employee jk = new Employee("JK", "Jeon", 901);
        Employee v = new Employee("V", "Kim", 1230);

        LinkedListStack stack = new LinkedListStack();
        stack.push(rm);
        stack.push(jin);
        stack.push(jimin);
        stack.push(jk);
        stack.push(v);

//        stack.printStack();

//        System.out.println(stack.peek());
//        stack.printStack();

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
